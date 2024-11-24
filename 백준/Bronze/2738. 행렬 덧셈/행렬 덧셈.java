import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] arr1 = new int [n][m];
        int[][] arr2 = new int [n][m];

        // 행렬 A
        for(int i = 0; i < n; i++){
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < m; j++){
                arr1[i][j] = Integer.parseInt(line[j]);
            }
        }

        // 행렬 B
        for(int i = 0; i < n; i++){
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < m; j++){
                arr2[i][j] = Integer.parseInt(line[j]);
            }
        }

        // 행렬 C ( A + B )
        int [][] arr3 = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                bw.write(arr3[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
