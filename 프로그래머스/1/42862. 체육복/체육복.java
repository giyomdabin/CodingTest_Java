import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length; //체육복을 갖고 있는 학생수 
        
        Arrays.sort(lost);
        
        List<Integer> lostStu = new ArrayList<>(); //4, 5
        List<Integer> reserveStu = new ArrayList<>(); //5, 6
        
        for(int i : reserve){
            reserveStu.add(i);
        }
        
        for(int i : lost){
            if(reserveStu.contains(i)){
                reserveStu.remove(reserveStu.indexOf(i));
                answer++;
            }else lostStu.add(i);
        }
        
        // for(int i = 0; i < lostStu.size(); i++){
        //     if(reserveStu.contains(lostStu.get(i))){
        //         reserveStu.remove(reserveStu.indexOf(lostStu.get(i)));
        //     }
        // }
        
        for(int i = 0; i < lostStu.size(); i++){
            if(reserveStu.contains(lostStu.get(i)-1)){
                answer++;
                reserveStu.remove(reserveStu.indexOf(lostStu.get(i)-1));
            }
            else if(reserveStu.contains(lostStu.get(i)+1)){
                answer++;
                reserveStu.remove(reserveStu.indexOf(lostStu.get(i)+1));
            }
        }
        
        return answer; //7
    }
}