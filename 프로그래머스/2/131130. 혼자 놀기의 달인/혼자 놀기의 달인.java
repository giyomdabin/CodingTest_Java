import java.util.*;
class Solution {
    public int solution(int[] cards) {
        int[] visited = new int[cards.length + 1];

        List<Integer> groups = new ArrayList<>();

        int current = 0;
        for (int i = 0; i < cards.length; i++) {
            if (visited[cards[i]] == 1) continue;
            current = cards[i];
            int count = 0;

            while (true) {
                if (visited[current] == 1) {
                    break;
                }
                count++;
                visited[current] = 1;
                current = cards[current - 1];
            }
            groups.add(count);
        }

        if (groups.size()  <= 1) return 0;

        Collections.sort(groups, Collections.reverseOrder()); // 내림차순으로 정렬
        int result = groups.get(0) * groups.get(1);
        return result;
    }
}