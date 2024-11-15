import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] arr = new char[26];

        for(int i =0; i < 26; i++) {
            arr[i] = (char) (i + 97);
        }

        int[] arr2 = new int[26];
        for(int i = 0; i < 26; i++) {
            arr2[i] = -1;
        }

        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < 26; j++) {
                if(str.charAt(i) == arr[j] && arr2[j] == -1) {
                    arr2[j] = i;
                }
            }
        }

        for(int i : arr2) bw.write(i + " ");

        bw.close();
    }
}