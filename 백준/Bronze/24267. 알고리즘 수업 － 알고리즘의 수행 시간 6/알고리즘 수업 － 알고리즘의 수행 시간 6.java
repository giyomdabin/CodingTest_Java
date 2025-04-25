import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Integer.parseInt(br.readLine());
        long a = 0;
        long b = 0;

        if(n <= 2) bw.write(0 + "\n");
        else {
            for (int i = 1; i < n-1; i++) {
                a = i + a;
                b += a;
            }
            bw.write(b + "\n");
        }
        bw.write(3 + "\n");
        bw.close();
    }
}