import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String num = input.split(" ")[0];
        int base = Integer.parseInt(input.split(" ")[1]);

        int sum = 0;
        int n = 0;
        int j = 0;

        for(int i = num.length() - 1; i >=0; i--) {
            if(base >= 10 && (num.charAt(i) >= 'A' && num.charAt(i) <= 'Z')) {
                n = num.charAt(i) - 55;
                sum += (int)Math.pow(base, j) * n;
            }else{
                sum += (int)Math.pow(base, j) * Integer.parseInt(String.valueOf(num.charAt(i)));
            }
            j++;
        }

        bw.write(sum + "\n");
        bw.flush();
    }
}