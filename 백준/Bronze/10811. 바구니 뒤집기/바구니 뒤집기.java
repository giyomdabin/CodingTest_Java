import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // 배열의 길이
        int m = Integer.parseInt(input[1]);

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = i+1;

        for(int i = 0; i < m; i++) {
            String[] input2 = br.readLine().split(" ");
            int a = Integer.parseInt(input2[0]);
            int b = Integer.parseInt(input2[1]);

            int size = (b - a + 1) / 2;
            for(int j = 0; j < size; j++){
                int temp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = temp;
                a++; b--;
            }
        }
        for(int i : arr) System.out.print(i + " ");
    }
}