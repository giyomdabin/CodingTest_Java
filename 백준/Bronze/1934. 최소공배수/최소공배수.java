import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 최대공약수 구하기
            int max = 0;

            for(int j = 1; j <= a && j <= b; j++) {
                if(a % j == 0 && b % j == 0) {
                    max = j;
                }
            }
            bw.write( (a * b) / max + "\n");
        }

        bw.close();
    }
}