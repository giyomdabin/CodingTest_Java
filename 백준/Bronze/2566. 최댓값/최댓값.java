import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[9][9];

        // 초기화
        for(int i = 0; i < 9; i++) {
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }

        // 최대값 및 위치 찾기
        int max = arr[0][0];
        int row = 1;
        int col = 1;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        bw.write(max + "\n");
        bw.write(row + " " + col + "\n");
        bw.close();
    }
}
