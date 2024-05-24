import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        
        int[] stu1 = {1, 2, 3, 4, 5};
        int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
        
        scores[0] = grade(stu1, answers);
        scores[1] = grade(stu2, answers);
        scores[2] = grade(stu3, answers);
        
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        for(int i = 0; i < 3; i++){
            if(scores[i] == max) list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public int grade(int[] arr, int[] answers){
        int count = 0;
        for(int i=0; i<answers.length; i++){
            if(arr[i%arr.length] == answers[i]) count++;
        }
        return count;
    }
}