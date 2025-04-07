import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int K = Integer.parseInt(input.split(" ")[1]);

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N / 2; i++) {
            if(N % i == 0) list.add(i); // 약수인 경우 list에 넣기
        }

        list.add(list.size(), N);

        if(list.size() < K) bw.write(0 + "");
        else bw.write(list.get(K - 1) + "");

        bw.flush();
    }
}