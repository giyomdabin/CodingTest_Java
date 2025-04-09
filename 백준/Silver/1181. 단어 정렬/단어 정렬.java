import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for(int i = 0;  i < n; i++) {
            String word = br.readLine();

            if(list.contains(word)) continue; // 중복단어 방지
            else list.add(word);
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
               if(s1.length() > s2.length()) return 1;
               else if(s1.length() < s2.length()) return -1;
               else return s1.compareTo(s2);
            }
        });

        for(String word : list) {
            bw.write(word + "\n");
        }

        bw.close();
    }
}