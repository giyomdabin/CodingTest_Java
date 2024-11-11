import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "Hello World!";
        bw.write(s);
        bw.close();
    }
}
