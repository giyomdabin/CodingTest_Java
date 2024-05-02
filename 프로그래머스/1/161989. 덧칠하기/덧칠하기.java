import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        answer++;
        
        for(int i : section){
            if(start + m > i) continue;
            else{
                start = i;
                answer++;
            }
        }
        
        return answer;
    }
}