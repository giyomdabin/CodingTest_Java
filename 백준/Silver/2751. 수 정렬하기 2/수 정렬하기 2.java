import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        List<Long> nums = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            nums.add(Long.parseLong(br.readLine()));
        }

        Collections.sort(nums);

        for(long num :  nums) bw.write(num + "\n");
        bw.close();
    }
}