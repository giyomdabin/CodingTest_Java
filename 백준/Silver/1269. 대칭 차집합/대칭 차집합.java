import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        
        StringTokenizer inputA = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) {
            map.put(inputA.nextToken(), 1);
        }
        
        StringTokenizer inputB = new StringTokenizer(br.readLine());
        for(int i = 0; i < b; i++) {
            String num = inputB.nextToken();
            if(map.containsKey(num)) {
                map.remove(num);
            } else {
                map.put(num, 1);
            }
        }
        
        bw.write(map.size() + "");
        bw.close();
    }
}