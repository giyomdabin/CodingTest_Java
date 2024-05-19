import java.util.stream.IntStream;
class Solution {
    int i;
    public int solution(int[] numbers) {
        int answer = 0;
        
        
        for(i=0; i<=9; i++){
            if(!IntStream.of(numbers).anyMatch(x -> x == i))
                answer += i;
        }
        
        return answer;
    }
}