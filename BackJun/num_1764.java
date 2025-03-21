import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1.
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<String, Integer> map = new TreeMap<>();

        for(int i = 0; i < arr[0]+ arr[1]; i++){
            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // 2.
        int count =(int) map.entrySet().stream().filter(entry -> entry.getValue() == 2).count();

        bw.write(count+"\n");

        for(String key : map.keySet()){
            if(map.get(key) == 2){
                bw.write(key+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
