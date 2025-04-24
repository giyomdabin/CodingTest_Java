import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int k = Integer.parseInt(input.split(" ")[1]);

        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        int i = 1;
        int head = 0;

        while(!list.isEmpty()) { // 리스트가 비어있지 않을 때까지 실행
            if(i % k == 0) {
                head += (k - 1);
                if(head >= list.size()) {
                    head %= list.size();
                }
                q.offer(list.remove(head));
            }
            i++;
        }

        bw.write("<");
        while(!q.isEmpty()) {
            if(q.size() == 1) {
                bw.write(q.poll() + ">");
            } else{
                bw.write(q.poll() + ", ");
            }
        }
        bw.close();
    }
}