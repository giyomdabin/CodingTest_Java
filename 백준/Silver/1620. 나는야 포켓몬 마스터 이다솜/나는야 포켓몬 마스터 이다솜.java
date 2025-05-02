import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        // 포켓몬 입력 받기
        for(int i = 0; i < n; i++) {
            String pokemon = br.readLine();
            map1.put(pokemon, i + 1);
            map2.put(i + 1, pokemon);
        }

        // 문제 입력받기
        for(int i = 0; i < m; i++) {
            String question = br.readLine();

            if(Character.isDigit(question.charAt(0))) { // 문제의 첫 글자가 숫자인지 확인
                bw.write(map2.get(Integer.parseInt(question)) + "\n");
            } else {
                bw.write(map1.get(question) + "\n");
            }
        }

        bw.close();
    }
}