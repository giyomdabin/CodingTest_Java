import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람
        int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람

        Map<String, Integer> names = new HashMap<>();
        List<String> nm = new ArrayList<>();

        for(int i = 0; i < n + m; i++) {
            String name = br.readLine();
            if(names.containsKey(name)) {
                nm.add(name);
            } else {
                names.put(name, 1);
            }
        }

        Collections.sort(nm, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        bw.write(nm.size() + "\n");
        for(String name : nm) bw.write(name + "\n");

        bw.close();
    }
}