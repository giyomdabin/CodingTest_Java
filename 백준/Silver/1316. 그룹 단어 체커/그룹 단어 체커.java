import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0; // 그룹 단어가 몇 개인지?
        int n = Integer.parseInt(br.readLine()); // 몇 개의 단어를 입력 받을 것인지?

        for(int i = 0; i < n; i++) {
            String str = br.readLine();

            boolean[] arr = new boolean[26];
            int prev = 0;
            boolean check = true;

            for(int j = 0; j < str.length(); j++) {
                int now = str.charAt(j);

                if(prev != now) {

                    if(arr[now - 'a'] ==  false) {
                        prev = now;
                        arr[now - 'a'] = true;
                    } else {
                        check = false;
                        break;
                    }
                }
            }
            
            if(check) count++;
        }


        bw.write(count + "\n");
        bw.flush();
    }
}