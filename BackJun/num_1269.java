import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class num_1269 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        // 1.
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < a.length; i++){
            String key = String.valueOf(a[i]);
            map.put(key, map.getOrDefault(key, 0)+1);
        }

        for(int i = 0; i < b.length; i++){
            String key = String.valueOf(b[i]);
            map.put(key, map.getOrDefault(key, 0)+1);
        }

        int count = 0;

        for(String key : map.keySet()){
            if(map.get(key) == 1){
                count++;
            }
        }

        System.out.println(count);

        br.close();
    }
}
