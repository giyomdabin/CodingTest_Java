import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 0;
        while(i < 100){
            String str = br.readLine();
            if(str == null) break;
            bw.write(str + "\n");
            i++;
        }
        bw.close();
    }
}