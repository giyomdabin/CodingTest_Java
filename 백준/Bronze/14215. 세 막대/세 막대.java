import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        for(int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        if(arr[0] + arr[1] <= arr[2]) {
            while(true) {
                arr[2]--;
                if(arr[0] + arr[1] > arr[2]) break;
            }
        }

        bw.write(arr[0] + arr[1] + arr[2] + "");

        bw.close();
    }
}