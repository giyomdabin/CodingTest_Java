import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        // 요리 시작 시간
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int c = Integer.parseInt(br.readLine()); //  걸리는 시간

        b += (a * 60) + c; // 총 걸리는 시간
        a = (b / 60) % 24;
        b = b % 60;

        System.out.println(a + " " + b);
    }
}