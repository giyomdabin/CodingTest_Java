import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = br.readLine();
            if(input.equals("0 0 0")) break;

            int[] arr = new int[3];
            arr[0] = Integer.parseInt(input.split(" ")[0]);
            arr[1] = Integer.parseInt(input.split(" ")[1]);
            arr[2] = Integer.parseInt(input.split(" ")[2]);

            Arrays.sort(arr);

            if(arr[0] == arr[1] && arr[1] == arr[2]) bw.write("Equilateral\n");
            else if(arr[0] + arr[1] <= arr[2]) bw.write("Invalid\n");
            else if(arr[0] == arr[1] || arr[1] == arr[2]) bw.write("Isosceles\n");
            else bw.write("Scalene\n");
        }

        bw.close();
    }
}