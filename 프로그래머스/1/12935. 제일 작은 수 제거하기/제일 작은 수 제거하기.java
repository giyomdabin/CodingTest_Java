import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int min = arr[0];
        
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        
        if (arr.length == 1) {
            answer.add(-1);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}