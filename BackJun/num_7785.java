import java.io.*;
import java.util.*;

public class num_7785 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        // 1. 
        Map<String, String> map = new TreeMap<>((s1, s2) -> s2.compareTo(s1));

        for(int i = 0; i < count; i++){
            String[] arr = br.readLine().split(" ");

            map.put(arr[0], arr[1]);
        }

        for(String key : map.keySet()){
            if(map.get(key).equals("enter")){
                bw.write(key+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}