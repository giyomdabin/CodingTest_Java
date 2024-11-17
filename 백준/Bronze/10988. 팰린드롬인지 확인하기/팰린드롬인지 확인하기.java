import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // level -> 1 / baekjoon - > 0
        String str = br.readLine();
        int last = str.length() - 1;
        int sum = 0;
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) == str.charAt(last)) {
                last--;
                sum++;
            } else {
                break;
            }
        }

        if(sum == str.length() / 2) bw.write("1");
        else bw.write("0");
        bw.close();
    }
}