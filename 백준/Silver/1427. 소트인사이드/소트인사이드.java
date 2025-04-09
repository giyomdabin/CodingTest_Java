import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i) - '0');
        }

        Collections.sort(list, Collections.reverseOrder());

        for(int i : list) bw.write(i + "");

        bw.close();
    }
}