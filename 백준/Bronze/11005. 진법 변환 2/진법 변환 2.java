import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int B = Integer.parseInt(input.split(" ")[1]);

        List<Character> answer = new ArrayList<Character>();

        int mod = 0;

        for(int i = 0; N != 0; i++) {
            mod = N % B;
            if(mod >= 10){
                answer.add((char) (mod + 55));
            } else if(mod == 0){
                answer.add('0');
            }else {
                answer.add((char)(mod + '0'));
            }
            N /= B;
        }

        Collections.reverse(answer);

        for(Character c : answer){
            bw.write(c + "");
        }
        bw.flush();
    }
}