import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Queue queue = new LinkedList();
        int back = 0;

        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] str = input.split(" ");

            switch (str[0]) {
                case "push" :
                    back = Integer.parseInt(str[1]);
                    queue.offer(Integer.parseInt(str[1]));
                    break;

                case "pop" :
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.poll() + "\n");
                    break;

                case "size" :
                    bw.write(queue.size() + "\n");
                    break;

                case "empty" :
                    if(queue.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;

                case "front" :
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.peek() + "\n");
                    break;

                case "back" :
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(back + "\n");
                    break;
            }
        }

        bw.close();
    }
}