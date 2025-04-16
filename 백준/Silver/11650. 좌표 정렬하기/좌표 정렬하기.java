import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][2];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(points, (o1, o2) -> {
            if(o1[0] != o2[0]) return o1[0] - o2[0];
            else return o1[1] - o2[1];
        });

        for(int i = 0; i < n; i++) {
            bw.write(points[i][0] + " " + points[i][1] + "\n");
        }

        bw.close();
    }
}