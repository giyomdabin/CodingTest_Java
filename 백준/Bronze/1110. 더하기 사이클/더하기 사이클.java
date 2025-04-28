import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            bw.write("1");
        } else {
            int ans = n;
            int newN = 0;
            int count = 0;
            while (newN != n) {
                newN = ans;
                count++;
                if (n < 10) {
                    n = n * 10 + n;
                } else {
                    n = (n % 10) * 10 + ((n % 10) + (n / 10)) % 10;
                }
            }

            bw.write(count + "");
        }
        bw.close();
    }
}