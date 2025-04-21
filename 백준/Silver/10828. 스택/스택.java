import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> x = new Stack<>();

        for(int i = 0; i < n; i++) {
            String input = br.readLine();

            if(input.startsWith("push")) {
                int num = Integer.parseInt(input.split(" ")[1]);
                x.push(num);

            } else if (input.equals("pop")) {
                if(x.isEmpty()) bw.write("-1\n"); // 비어있으면 -1 출력
                else bw.write(x.pop() + "\n");

            } else if (input.equals("size")) {
                bw.write(x.size() + "\n");

            } else if (input.equals("empty")) {
                if(x.isEmpty()) bw.write("1\n");
                else bw.write("0\n");

            } else {
                if(x.isEmpty()) bw.write("-1\n");
                else bw.write(x.get(x.size() - 1) + "\n"); // 빼지 않고 출력만
            }
        }

        bw.close();
    }
}