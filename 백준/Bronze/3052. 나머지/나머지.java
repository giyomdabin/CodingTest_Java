import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[42];
        int count = 0;

        for(int i = 0; i < 10; i++){
            int remain = Integer.parseInt(br.readLine());
            if(arr[remain % 42] == 0){
                arr[remain % 42]++;
                count++;
            }
        }

        bw.write(count + "\n");
        bw.close();
    }
}