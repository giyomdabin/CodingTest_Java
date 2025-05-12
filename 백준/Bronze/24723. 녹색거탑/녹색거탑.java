import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 1;

        for(int i = 0; i < n; i++) {
            answer *= 2;
        }

        bw.write(answer + "");
        bw.close();
    }
}