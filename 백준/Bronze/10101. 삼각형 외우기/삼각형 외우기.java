import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[] angle = new int[3];
        for(int i = 0; i < 3; i++) {
            angle[i] = Integer.parseInt(br.readLine());
        }

        int sum = angle[0] + angle[1] + angle[2];

        if((angle[0] == 60) && (angle[1] == 60) && (angle[2] == 60)) { // 세 각이 모두 60인 경우
            bw.write("Equilateral");
        } else if((sum == 180) &&
                ((angle[0] == angle[1]) || (angle[1] == angle[2]) || (angle[0] == angle[2]))) {
            bw.write("Isosceles");
        } else if ((sum == 180) && (angle[0] != angle[1]) && (angle[1] != angle[2]) && (angle[0] != angle[2])) {
            bw.write("Scalene");
        } else {
            bw.write("Error");
        }

        bw.close();
    }
}