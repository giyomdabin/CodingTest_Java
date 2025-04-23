import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int j = 1;

        boolean b = true;

        for(int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            if(stack.isEmpty()) { // 스택이 비어있으면 무조건 넣는다.
                stack.push(j);
                sb.append("+\n");
                j++;
            }

            if(input < stack.peek()) {
                b = false;
                break;
            }

            if(input == stack.peek()){ // input값과 top의 값 비교 
                stack.pop();
                sb.append("-\n");
                continue;
            }

            while (j <= input) {
                stack.push(j);
                sb.append("+\n");
                j++;

                if(stack.peek() == input) {
                    stack.pop();
                    sb.append("-\n");
                    break;
                }
            }
        }

        if(b) bw.write(sb + "");
        else bw.write("NO\n");

        bw.close();
    }
}
