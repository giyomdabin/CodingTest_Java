import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken()); // 너비
        int h = Integer.parseInt(st.nextToken()); // 높이

        int[] arr = {x, y, w - x, h - y};
        int answer = arr[0];

        for(int i = 1;  i < 4; i++) {
            if(answer > arr[i]) answer = arr[i];
        }

        bw.write(answer + "\n");

        bw.close();
    }
}