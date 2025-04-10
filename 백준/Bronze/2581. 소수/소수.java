import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0; // 소수들의 합
        int min = 0; // 최솟값
        int divisor;
        
        if(m == 1) m++; // m이 1이면 for문에서 제외 (소수가 아니므로 판별 x)

        for(int i = m; i <= n; i++) {
            divisor = 0;
            for(int j = 1; j <= i / 2; j++) {
                if(i % j == 0) {
                    divisor++;
                }
            }

            if(divisor == 1) {
                if(sum == 0 && m != 1) min = i;
                sum += i;
            }
        }

        if(sum == 0) bw.write(-1 + ""); // 소수가 없는 경우 == 합이 0인 경우: -1 출력
        else bw.write(sum + "\n" + min);

        bw.close();
    }
}