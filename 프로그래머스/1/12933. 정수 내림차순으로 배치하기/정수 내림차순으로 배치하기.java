import java.util.*;

class Solution {
    public long solution(long n) {
        String str = "";
        List<Long> nums = new ArrayList<>();
        
        while (n > 0) {
            nums.add(n%10);
            n /= 10;
        }
        Collections.sort(nums, Collections.reverseOrder());
        
        for(int i = 0; i < nums.size(); i++){
            str += nums.get(i);
        }
        
        long answer = Long.parseLong(str);
        
        return answer;
    }
}