import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            String str = input[1];
            String newStr = "";
            for(int j = 0;  j < str.length(); j++) {
                for(int k = 0; k < r; k++){
                    newStr += str.charAt(j);
                }
            }
            bw.write(newStr + "\n");
        }
        bw.close();
    }
}