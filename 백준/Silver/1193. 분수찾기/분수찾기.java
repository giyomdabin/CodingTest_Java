import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        int count = 0;
        int i = 1;
        int den = 0;
        int num = 0;
        while(count < input) {
            count = count + i;
            i++;
        }

        if((i - 1) % 2 == 0) {
            den = 1 + (count - input);
            num = (i - 1) - (count - input);
        }else {
            den = (i - 1) - (count - input);
            num = 1 + (count - input);
        }

        bw.write(num + "/" + den);
        bw.flush();
    }
}