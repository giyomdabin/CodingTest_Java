import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력: 킹(1), 퀸(1), 룩(2), 비숍(2), 나이트(2), 폰(8) (순서대로)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input =  br.readLine().split(" ");

        int king = 1 - Integer.parseInt(input[0]);
        int queen = 1 - Integer.parseInt(input[1]);
        int rook = 2 - Integer.parseInt(input[2]);
        int bishop = 2 - Integer.parseInt(input[3]);
        int knight = 2 - Integer.parseInt(input[4]);
        int pawn = 8 - Integer.parseInt(input[5]);

        bw.write(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
        bw.close();
    }
}