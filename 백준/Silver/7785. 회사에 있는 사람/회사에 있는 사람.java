import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String commute = st.nextToken();

            if(commute.equals("enter")) map.put(name, 1);
            else map.remove(name);
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, Collections.reverseOrder());

        for(String name : keySet) bw.write(name + "\n");
        bw.close();
    }
}