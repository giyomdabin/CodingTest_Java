import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];
        String[] input = br.readLine().split(" ");

        for(int i = 0; i < n; i++){
            arr[i] = Double.parseDouble(input[i]);
        }

        // 최고점 찾기
        double max = arr[0];
        for(double i : arr){
            if(i > max) max = i;
        }

        // 점수 조작하기
        double sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = (double) (arr[i]/max) * 100;
            sum += arr[i];
        }
        System.out.println(sum/n);
    }
}