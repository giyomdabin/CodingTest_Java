import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        answer.add(arr[0]);
        
        int before = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(before != arr[i]) answer.add(arr[i]);
            before = arr[i];
        }

        return answer;
    }
}