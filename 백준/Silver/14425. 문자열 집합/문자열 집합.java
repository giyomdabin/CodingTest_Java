import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(br.readLine(), i + 1);
        }

        int count = 0;

        for(int i = 0; i < m; i++) {
            if(map.containsKey(br.readLine())) {
                count++;
            }
        }
        bw.write(count + "");
        bw.close();
    }
}