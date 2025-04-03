import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int dot = 2;
        int input = Integer.parseInt(br.readLine());

        for(int i = 0; i < input; i++) {
            dot += (int)Math.pow(2, i);
        }

        bw.write((int)Math.pow(dot, 2) + "");
        bw.flush();
    }
}