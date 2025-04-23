import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long count = 0;

        for(int i = 1; i <= n - 1; i++) count += i;

        bw.write(count + "\n2");
        bw.close();
    }
}
