import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character, Integer> m = new HashMap<>(); // 문자 저장 리스트
        
        for(int i=0; i<s.length(); i++){
            if(m.containsKey(s.charAt(i))){
                answer[i] = i - m.get(s.charAt(i));
                m.replace(s.charAt(i), i);
            }
            else {
                m.put(s.charAt(i), i);
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}