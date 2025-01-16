class Solution {
    public int solution(int n, int k) {
        int answer = n * 12000 + k * 2000;
        
        int div = n / 10;
        answer -= div * 2000;
        
        return answer;
    }
}