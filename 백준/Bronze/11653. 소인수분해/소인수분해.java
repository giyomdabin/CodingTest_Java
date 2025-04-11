import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int i = 2;

        while(i <= n / 2) {
            if(n % i == 0) {
                n /= i;
                bw.write(i + "\n");
            } else i++;
        }

        if (n != 1) bw.write(n + "\n");

        bw.close();
    }
}