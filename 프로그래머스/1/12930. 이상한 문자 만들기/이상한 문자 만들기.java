class Solution {
    public String solution(String s) {
        String answer = "";
        int n = 0;
        
        for (int i = 0; i < s.length(); i++){
            String sub = s.substring(i,i+1);
            
            if (sub.equals(" ")){
                answer += " ";
                n = 0;
            }else{
                if (n % 2 == 0){
                    answer += sub.toUpperCase();
                    n++;
                }else{
                    answer += sub.toLowerCase();
                    n++;
                }
            }
        }
        return answer;
    }
}