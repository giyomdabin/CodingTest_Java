import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double sumCredit = 0;
        double sumGrade = 0;
        double sum = 0;

        for(int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            String sub = input[0];
            double credit = Double.parseDouble(input[1]);
            String grade = input[2];
            double score = 0.0;

            if(grade.equals("P")) {
                continue;
            }
            sumCredit += credit;
            score = gradeToScore(grade);
            sum = sum + (credit * score);
            sumGrade += score;
        }
        bw.write((sum / sumCredit) + "\n");
        bw.close();
    }

    private static double gradeToScore(String grade) {
        if(grade.equals("A+")) return 4.5;
        else if(grade.equals("A0")) return 4.0;
        else if(grade.equals("B+")) return 3.5;
        else if(grade.equals("B0")) return 3.0;
        else if(grade.equals("C+")) return 2.5;
        else if(grade.equals("C0")) return 2.0;
        else if(grade.equals("D+")) return 1.5;
        else if(grade.equals("D0")) return 1.0;
        else  return 0.0;
    }
}
