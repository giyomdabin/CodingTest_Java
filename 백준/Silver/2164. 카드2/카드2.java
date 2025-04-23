import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList();
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while(queue.size() != 1) {
            queue.poll(); // head 값 버리기

            // 새로운 head를 맨 뒤로 옮기기
            int num = queue.poll();
            queue.offer(num);
        }

        bw.write(queue.peek() + "\n");
        bw.close();
    }
}