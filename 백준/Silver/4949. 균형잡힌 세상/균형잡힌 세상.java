import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();

            if(input.equals(".")) { // 종료조건
                bw.close();
                return;
            }

            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == '(' || input.charAt(i) == '[') {
                    stack.push(input.charAt(i));

                } else if(input.charAt(i) == ')') {
                    if(stack.isEmpty() || stack.peek() != '('){
                        stack.push(input.charAt(i));
                        break;
                    }
                    stack.pop();

                } else if(input.charAt(i) == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        stack.push(input.charAt(i));
                        break;
                    }
                    stack.pop();
                }
            }

            if(!stack.isEmpty()) bw.write("no\n");
            else bw.write("yes\n");
        }
    }
}