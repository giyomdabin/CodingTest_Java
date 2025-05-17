import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        
        bw.write(fact(n) / (fact(k) * fact(n - k)) + "");
        bw.close();
    }
    
    static int fact(int num)
    {
        int result = 1; 

        for(int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}