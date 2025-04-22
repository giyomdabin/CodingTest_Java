import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> nums = new Stack<>();
        int answer = 0;

        for(int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0) answer -= nums.pop();
            else answer += nums.push(num);
        }

        bw.write(answer + "");
        bw.close();
    }
}