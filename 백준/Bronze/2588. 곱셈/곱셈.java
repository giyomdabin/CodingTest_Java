import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int units = B % 10; B /= 10;
        int tens = B % 10; B /= 10;

        System.out.println(A * units);
        System.out.println(A * tens);
        System.out.println(A * B);
        System.out.println(A * units + A * tens * 10 + A * B * 100);

    }
}