import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] arr = new char[15][15]; // 단어의 길이는 최대 15자
        String answer = "";

        // 배열 초기화
        for(int i = 0; i < 5; i++) {
            String str = br.readLine();
            for(int j = 0;  j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i < arr[0].length; i++) {
            for(int j = 0; j < 15; j++) {
               if(arr[j][i] == 0) continue;
               answer += Character.toString(arr[j][i]);
            }
        }

        bw.write(answer);
        bw.flush();
    }
}