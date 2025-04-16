import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i ++) {
            map.put(Integer.parseInt(st.nextToken()), 1);
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int num = Integer.parseInt(st2.nextToken());

            if(map.containsKey(num)) bw.write(map.get(num) + "\n");
            else bw.write(0 + "\n");
        }
        bw.close();
    }
}