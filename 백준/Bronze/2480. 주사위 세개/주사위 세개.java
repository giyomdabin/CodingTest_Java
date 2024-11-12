import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if(a == b && b == c) System.out.println(10000 + (a * 1000));
        else if(a == b || b == c || c == a){
            if(a == b) System.out.println(1000 + (a * 100));
            else if(b == c) System.out.println(1000 + (b * 100));
            else System.out.println(1000 + (c * 100));
        } else{
            int max = a;
            if(max < b) max = b;
            if(max < c) max = c;
            System.out.println(max * 100);
        }
    }
}