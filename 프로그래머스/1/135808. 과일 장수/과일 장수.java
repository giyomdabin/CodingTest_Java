import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        // k: 가장 높은 점수,  m개씩 포장, score: 사과들의 점수
        // 상자에 담긴 사과 중 가장 낮은 점수를 p라할 때, 사과 한 상자의 가격은 p*m
        
        int answer = 0;
        
        Arrays.sort(score); // score = {1, 1, 1, 2, 2, 3, 3} 
        for(int i = score.length - m; i >= 0; i -= m){
            answer += score[i] * m;  
        }
        
        
        return answer;
    }
}