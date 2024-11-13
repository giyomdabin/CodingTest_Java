import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] students = new int[30];

        for(int i = 0; i < 28; i++){
            int n = Integer.parseInt(br.readLine()) - 1;
            students[n]++;
        }

        for(int i = 0; i < 30; i++){
            if(students[i] == 0) bw.write((i + 1) + "\n");
        }
        br.close();
        bw.close();
    }
}