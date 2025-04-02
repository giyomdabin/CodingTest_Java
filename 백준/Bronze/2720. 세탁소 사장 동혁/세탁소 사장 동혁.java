import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());
            int[] arr = new int[4]; // 0: 쿼터, 1: 다임, 2: 니켈, 3:페니

            for(int j = 0; c != 0; j++) {
                if(c >= 25) {
                    arr[0] += c/25;
                    c %= 25;
                } else if(c >= 10) {
                    arr[1] += c/10;
                    c %= 10;
                } else if(c >= 5) {
                    arr[2] += c/5;
                    c %= 5;
                } else {
                    arr[3] += c;
                    c = 0;
                }
            }
            bw.write(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + "\n");
        }
        bw.flush();
    }
}