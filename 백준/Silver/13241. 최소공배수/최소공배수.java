import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        long max = 1;
        
        for(long i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        
        bw.write((a * b) / max + "");
        bw.close();
    }
}