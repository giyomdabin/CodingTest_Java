import java.util.*;
class Solution {
    public int solution(int n) {
        List<Integer> fibonacci = new ArrayList<>();
        
        fibonacci.add(0);
        fibonacci.add(1);
        
        for(int i = 0; i < n; i++) {
            fibonacci.add((fibonacci.get(i) + fibonacci.get(i+1)) % 1234567);
        }
        
        return fibonacci.get(n);
    }
}