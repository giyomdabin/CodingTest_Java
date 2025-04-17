import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(nums);

        bw.write(nums.get(1) + "");
        bw.close();
    }
}