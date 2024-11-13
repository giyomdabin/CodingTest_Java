import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);

        int[] arr = new int[n];

        for(int i = 0 ; i < m; i++){
            String[] input2 = br.readLine().split(" ");
            int x = Integer.parseInt(input2[0]);
            int y = Integer.parseInt(input2[1]);
            int z = Integer.parseInt(input2[2]);

            for(int j = x - 1; j < y; j++){
                arr[j] = z;
            }
        }

        for(int i : arr) bw.write(i + " ");
        bw.close();
    }
}