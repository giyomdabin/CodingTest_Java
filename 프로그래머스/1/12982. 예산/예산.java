import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0; // 몇 개 살 수 있는지?
        int sum = 0;
        
        Arrays.sort(d);
        
        if(d.length == 1 && d[0] > budget) return 0;
        
        for(int i = 0; i < d.length; i++){
            sum += d[i];
            count++;
            for(int j = i + 1; j < d.length; j++){
                if(sum + d[j] > budget) break;
                sum += d[j];
                count++;
            }
            if(answer < count) answer = count;
            sum = 0;
            count = 0;
        }
        return answer;
    }
}