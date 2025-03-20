import java.io.*;
import java.util.*;

public class num_10816 {
    public static void main(String[] args) throws IOException {

        // 1.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c1 = Integer.parseInt(br.readLine());
        int[] ar1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < c1; i++){
            String key = String.valueOf(ar1[i]);
            map.put(key, map.getOrDefault(key, 0) +1);
        }

        int c2 = Integer.parseInt(br.readLine());
        int[] ar2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // 2. 
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < c2; i++){
            String key = String.valueOf(ar2[i]);
            if(map.containsKey(key)){
                sb.append(map.get(key)).append(" ");
            } else {
                sb.append("0").append(" ");
            }
        }

        String answer = sb.toString().trim();
        System.out.println(answer);

        br.close();
    }
}
