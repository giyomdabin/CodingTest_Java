import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0;  i < n; i++) {
            String s = br.readLine();

            int score = 0;
            char prev = 'O';
            int sum = 0; // 점수의 합

            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) != prev && s.charAt(j) == 'O'){
                    score = 1;
                    sum += score;
                    prev = s.charAt(j);
                } else if (s.charAt(j) == prev && s.charAt(j) == 'O') {
                    score++;
                    sum += score;
                } else {
                    score = 0;
                }
            }

             bw.write(sum + "\n");
        }

        bw.close();
    }
}