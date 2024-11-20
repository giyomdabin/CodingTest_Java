import java.util.*;
class Solution {
    public int solution(int[] cards) {
        int result = 0;
        int[] visited = new int[cards.length + 1];

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < cards.length; i++) {
            if (visited[cards[i]] == 1) continue;
            int current = cards[i];
            int count = 0;

            while (true) {
                if (visited[current] == 1) {
                    break;
                }
                count++;
                visited[current] = 1;
                current = cards[current - 1];
            }
            list.add(count);
        }

        if (list.size()  <= 1) return 0;

        Collections.sort(list, Collections.reverseOrder()); // 내림차순으로 정렬
        result = list.get(0) * list.get(1);
        return result;
    }
}