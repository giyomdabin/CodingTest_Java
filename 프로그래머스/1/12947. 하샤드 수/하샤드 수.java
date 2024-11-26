import java.util.*;
class Solution {
    public boolean solution(int x) {
        int sum = 0;
        
        String num = Integer.toString(x);
        for(int i = 0; i < num.length(); i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        
        if(x % sum == 0) return true;
        return false;
    }
}