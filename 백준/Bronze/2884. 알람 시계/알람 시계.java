import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int H = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]) - 45;

        if(M < 0){
            H -= 1;
            M += 60;
        }
        if(H == -1) H = 23;
        System.out.println(H + " " + M);
    }
}