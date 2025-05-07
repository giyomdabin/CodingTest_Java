import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); //좌표의 개수

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n]; //정렬하기 전에 저장할 배열
        int[] arr2 = new int[n];
        
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            arr2[i] = num;
        }

        Arrays.sort(arr2); 

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int index = 0;
        for(int i : arr2){ 
            if(!map.containsKey(i)) map.put(i, index++);
            
        }

        for(int i : arr){ 
            bw.write(map.get(i) + " ");
        }

        bw.close();
    }
}