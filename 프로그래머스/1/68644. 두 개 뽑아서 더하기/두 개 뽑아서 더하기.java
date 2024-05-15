import java.util.*;
class Solution {
    public Integer[] solution(int[] numbers) {
        
        List<Integer> sum = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(sum.contains(numbers[i] + numbers[j])) continue;
                else sum.add(numbers[i] + numbers[j]);
            }
        }
        
        Collections.sort(sum); // 오름차순 정렬
        
        Integer[] answer = new Integer[sum.size()];
        sum.toArray(answer);
        
        return answer;
    }
}