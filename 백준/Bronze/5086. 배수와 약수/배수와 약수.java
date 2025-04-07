import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = br.readLine();
            int num1 = Integer.parseInt(input.split(" ")[0]);
            int num2 = Integer.parseInt(input.split(" ")[1]);

            if(num1 == 0 && num2 == 0) return; // 0 0 이 입력되면 종료

            if(num2 > num1 && (num2 % num1) == 0) {
                bw.write("factor\n");
            } else if (num1 > num2 && (num1 % num2) == 0) {
                bw.write("multiple\n");
            } else bw.write("neither\n");

            bw.flush();
        }
    }
}