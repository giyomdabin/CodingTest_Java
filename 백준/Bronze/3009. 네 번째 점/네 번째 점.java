import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] points = new int[3][2];

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        int x = 0;
        int y = 0;

        if(points[0][0] == points[1][0]) {
            x = points[2][0];
        } else if(points[1][0] == points[2][0]) {
            x = points[0][0];
        } else {
            x = points[1][0];
        }

        if(points[0][1] == points[1][1]) {
            y = points[2][1];
        } else if(points[1][1] == points[2][1]) {
            y = points[0][1];
        } else {
            y = points[1][1];
        }

        bw.write(x + " " + y);

        bw.close();
    }
}