import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[100][100];
        int sum = 0;

        int n = Integer.parseInt(br.readLine()); // 몇 개의 색종이?

        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            int x = Integer.parseInt(input.split(" ")[0]);
            int y = Integer.parseInt(input.split(" ")[1]);

            for(int j = y; j < y + 10; j++) {
                for(int k = x; k < x + 10; k++) {
                    if(arr[k][j] == 0) {
                        sum++;
                        arr[k][j] = 1;
                    }
                }
            }
        }
        bw.write(sum + "\n");
        bw.flush();
    }
}