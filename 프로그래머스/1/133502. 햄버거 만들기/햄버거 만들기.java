import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> food = new ArrayList<>();
        
        // 순서 : 1->2->3->1
        for(int i=0; i<ingredient.length; i++){
            food.add(ingredient[i]);
            if(food.size() >= 4 && food.get(food.size()-4) == 1 && food.get(food.size()-3) == 2 
               && food.get(food.size()-2) == 3 && food.get(food.size()-1) == 1){
                answer++;
                for(int j=0; j<4; j++) food.remove(food.size()-1);
            }
        }
        
        return answer;
    }
}