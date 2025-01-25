class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        int index=0;
        
        for(int i=0; i< answer.length; i++) {
            int[] arr = new int[n];
            for(int k=0; k<n; k++) {
                arr[k] = num_list[index];
                index++;
            }
            answer[i] = arr;
        }
        return answer;
    }
}