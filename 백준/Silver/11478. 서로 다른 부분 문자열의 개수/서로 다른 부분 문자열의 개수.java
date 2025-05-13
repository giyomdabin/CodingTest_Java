import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        Map<String, Integer> map = new HashMap<>();
        int answer = 0;

        for(int i = 1; i <= str.length(); i++) {
            int j = 0;
            while(true) {
               String newStr;

               if(j + i > str.length()) {
                   break;
               } else {
                   newStr = str.substring(j, j + i);
                   j++;
               }

               if(map.containsKey(newStr)) {
                   continue;
               } else {
                   map.put(newStr, 1);
                   answer++;
               }
           }
        }

        bw.write(answer + "");
        bw.close();
    }
}