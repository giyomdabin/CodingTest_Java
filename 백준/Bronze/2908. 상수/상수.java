import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String input1  = st.nextToken();
        String input2 = st.nextToken();
        String str1 = "";
        String str2 = "";

        for(int i = 2; i >= 0; i--){
            str1 += input1.charAt(i)+"";
            str2 += input2.charAt(i)+"";
        }

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        if(num1 > num2) bw.write(num1 + "\n");
        else bw.write(num2 + "\n");

        bw.close();
    }
}