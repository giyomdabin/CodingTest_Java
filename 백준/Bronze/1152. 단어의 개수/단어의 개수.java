import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String str = br.readLine().trim();
        String[] input = str.split(" ");
        if(input[0].equals("")){
            bw.write("0\n");
        }else{
            bw.write(input.length+"\n");
        }

        bw.close();
    }
}