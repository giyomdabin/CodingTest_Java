class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        // aya, ye, woo, ma
        
        for(String baby : babbling){
            if(baby.contains("ayaaya") || baby.contains("yeye") ||
              baby.contains("woowoo") || baby.contains("mama")) continue;
            
            // replace 치환해서 반환함
            baby = baby.replace("aya", " ");
            baby = baby.replace("ye", " ");
            baby = baby.replace("woo", " ");
            baby = baby.replace("ma", " ");
            
            baby = baby.replace(" ", "");
        
            if(baby.length() == 0) answer++;
            
            
       }
        return answer;
    }
}