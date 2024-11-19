import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String upper = str.toUpperCase();

        Map<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < upper.length(); i++){
            if(hm.containsKey(upper.charAt(i))){
                hm.put(upper.charAt(i), hm.get(upper.charAt(i)) + 1);
            }else{
                hm.put(upper.charAt(i), 1);
            }
        }

        int count = 0;
        Integer max = Collections.max(hm.values());
        Character maxChar = null;

        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if(max.equals(entry.getValue())){
                maxChar = entry.getKey();
                count++;
            }
        }

        if(count == 1) bw.write(maxChar + "\n");
        else  bw.write("?");
        bw.close();
    }
}