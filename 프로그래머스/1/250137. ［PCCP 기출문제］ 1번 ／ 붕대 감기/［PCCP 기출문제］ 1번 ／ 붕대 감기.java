class Solution {
    public int solution(int[] bandage, int health, int [][] attacks) {
        int current_health = health; // 현재 체력
        int success = 0; // 연속 송공
        int length = 0;
        
        // attacks.length 행의 개수
        // i를 시간이라 생각
        for(int i=1; i <= attacks[attacks.length-1][0]; i++){
            if(attacks[length][0] != i){ 
                current_health += bandage[1];
                success++;
                
                if(success == bandage[0]){
                    current_health += bandage[2];
                    success = 0;
                }
                
                if(current_health >= health) current_health = health;
            }
            else{
                current_health-=attacks[length][1];
                success = 0;
                
                if(current_health <= 0 ) return -1;
                length++;
            }
        }
        return current_health;
    }
}