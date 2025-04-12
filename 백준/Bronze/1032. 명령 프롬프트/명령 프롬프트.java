import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        String answer = "";

        if(n == 1) {
            answer = br.readLine();
        } else {
            for(int i = 0; i < n; i++){
                str[i] = br.readLine();
            }

            for(int i = 0; i < str[0].length(); i++){
                char c = str[0].charAt(i);
                for(int j = 1; j < n; j++){
                    if(c != str[j].charAt(i)){
                        answer += "?";
                        break;
                    }

                    if(j == n - 1){
                        answer += c;
                    }
                }
            }
        }

        bw.write(answer);
        bw.close();
    }
}