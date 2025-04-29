import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        boolean b = false;

        for(int i = 1; i <= num; i++) {
            String k = String.valueOf(i);
            int sum = i;

            for(int j = 0; j < k.length(); j++) {
                sum += Integer.parseInt(String.valueOf(k.charAt(j)));
            }

            if(sum == num) {
                bw.write(i + "");
                b = true;
                break;
            }
        }

        if(!b) {
            bw.write("0");
        }
        
        bw.close();
    }
}