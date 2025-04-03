import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int answer = 1; // 시작은 무조건 포함
        int room = 1; // 1번 방부터 시작

        while(true) {
            if(input <= room) break;
            room += (6 * answer);
            answer++;
        }

        bw.write(answer + "");
        bw.flush();
    }
}