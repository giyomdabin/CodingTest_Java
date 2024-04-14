import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        
        for(int i=0; i<players.length; i++)
            h.put(players[i], i);
        
        for(int i=0; i<callings.length; i++){
            
            int rank=h.get(callings[i]);
            
            String forward=players[rank-1];
            players[rank-1]=players[rank];
            players[rank]=forward;
            
            h.put(players[rank-1], rank-1);
            h.put(players[rank], rank);
        }
        
        answer = players;
        
        return answer;
    }
}