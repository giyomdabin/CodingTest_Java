import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 1;
        
        int same = 1;
        int no = 0;
        char text = s.charAt(0);
        
        for(int i=1; i<s.length(); i++){
            if(same==no){
                answer++;
                same = 0;
                no = 0;
                text = s.charAt(i); // 2: n
                System.out.println(i + ": " + text);
            }
            
            if(s.charAt(i) == text) same++; 
            else no++;
            
        }
        return answer;
    }
}