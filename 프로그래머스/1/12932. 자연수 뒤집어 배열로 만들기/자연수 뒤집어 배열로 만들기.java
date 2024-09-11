import java.util.*;
class Solution {
    public long[] solution(long n) {
        long[] answer = new long[(int)(Math.log10(n)+1)];
        int i = 0;
        
        while(n > 0) {
            answer[i] = n % 10;
            
            i++;
            n /= 10;
            
        }
        return answer;
    }
}