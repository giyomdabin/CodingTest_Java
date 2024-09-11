import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pNum = 0, yNum = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') pNum++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') yNum++;
        }
        
        if(pNum == yNum) return answer;
        else answer = false;

        return answer;
    }
}