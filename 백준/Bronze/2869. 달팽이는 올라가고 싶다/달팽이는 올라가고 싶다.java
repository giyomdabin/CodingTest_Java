import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int A = Integer.parseInt(input.split(" ")[0]);
        int B = Integer.parseInt(input.split(" ")[1]);
        int V = Integer.parseInt(input.split(" ")[2]);

        int height = V - A;
        int daily = A - B;

        int count;

        if(height <= 0) count = 0;
        else count = (height + daily - 1) / daily;

        count += 1;
        bw.write(count + "\n");
        
        bw.flush();
    }
}