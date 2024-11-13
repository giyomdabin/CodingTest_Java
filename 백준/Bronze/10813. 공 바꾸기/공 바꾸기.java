import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i + 1;
        }

        for(int i = 0; i < m; i++){
            String[] input2 = br.readLine().split(" ");
            int x = Integer.parseInt(input2[0]) - 1;
            int y = Integer.parseInt(input2[1]) - 1;

            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }

        for(int i : arr) bw.write(i + " ");
        bw.close();
    }
}