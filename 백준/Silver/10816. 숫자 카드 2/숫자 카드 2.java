import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 갖고 있는 숫자 카드의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String , Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String num1 = st.nextToken();

            if(map.containsKey(num1)) map.put(num1, map.get(num1) + 1);
            else map.put(num1, 1);
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {
            String num2 = st2.nextToken();

            if(map.containsKey(num2)) {
                sb.append(map.get(num2) + " ");
            } else {
                sb.append("0 ");
            }
        }

        bw.write(sb.toString());
        bw.close();
    }
}