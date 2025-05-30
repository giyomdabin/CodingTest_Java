import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] score = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(score);

        bw.write(score[n - k] + "");
        bw.close();
    }
}