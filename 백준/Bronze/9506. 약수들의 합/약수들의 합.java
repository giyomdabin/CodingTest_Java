import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int num = Integer.parseInt(br.readLine());
            if(num == -1) return; // -1이면 종료

            int sum = 0; // 약수의 합
            List<Integer> list = new ArrayList<>(); // 약수를 담을 리스트 생성

            for(int i = 1; i <= num / 2; i++) {
                if(num % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }

            if (num == sum) {
                bw.write(num + " = ");
                for(int i = 0; i < list.size() - 1; i++) {
                    bw.write(list.get(i) + " + ");
                }
                bw.write(list.get(list.size() - 1) + "\n");
            } else bw.write(num + " is NOT perfect.\n");

            bw.flush();
        }
    }
}