import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0; // 소수 몇 개인지?

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            int divisor = 0;

            if(num == 1) continue; // 1은 소수가 아니므로 제외
            else {
                for(int j = 1; j <= num/2; j++) {
                    if(num % j == 0) divisor++;
                }
            }
            if(divisor == 1) count++;
        }

        bw.write(count + "");
        bw.close();
    }
}