import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }

        Arrays.sort(nums);

        bw.write(sum / 5 + "\n"); // 평균
        bw.write(nums[2] + "\n"); // 중앙값

        bw.close();
    }
}