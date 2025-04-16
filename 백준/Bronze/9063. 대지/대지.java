import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            x.add(Integer.parseInt(input.split(" ")[0]));
            y.add(Integer.parseInt(input.split(" ")[1]));
        }

        if(n == 1) {
            bw.write("0");
        } else {
            Collections.sort(x);
            Collections.sort(y);

            int width = x.get(n - 1) - x.get(0);
            int height = y.get(n - 1) - y.get(0);
            bw.write(width * height + "");
        }
        bw.close();
    }
}