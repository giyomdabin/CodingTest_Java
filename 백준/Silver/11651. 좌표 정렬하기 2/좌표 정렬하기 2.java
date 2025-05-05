import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[][] point = new int[n][2];
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            point[i][0] = Integer.parseInt(st.nextToken());
            point[i][1] = Integer.parseInt(st.nextToken());
        }    
        
        Arrays.sort(point, (o1, o2) -> {
            if(o1[1] != o2[1]) return o1[1] - o2[1];
            else return o1[0] - o2[0];
        });
        
        for(int i = 0; i < n; i++) {
            bw.write(point[i][0] + " " + point[i][1] + "\n");
        }

        bw.close();
    }
}