import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            int len = str.length();
            bw.write(String.valueOf(str.charAt(0))+String.valueOf(str.charAt((len-1)))+"\n");
        }
        bw.close();
    }
}