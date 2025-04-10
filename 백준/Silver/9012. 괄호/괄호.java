import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String str = br.readLine();

            Stack<Character> stack = new Stack<Character>();

            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '(') {
                    stack.push(str.charAt(j));
                } else {
                    //비어있는지를 확인
                    if(stack.empty()) {
                        stack.push(str.charAt(j));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(stack.empty()) bw.write("YES\n");
            else bw.write("NO\n");
        }
        bw.close();
    }
}