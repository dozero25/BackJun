
//시간 초과 오류
public class num_1620 {    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 1.
        int[] count = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<String, String> map = new HashMap<>();

        for(int i = 1; i <= count[0]; i++ ){
            map.put(br.readLine(), String.valueOf(i));
        }
        // 2.
        for(int i = 0; i < count[1]; i++){
            String res = br.readLine();

            for(Map.Entry<String, String> entry : map.entrySet()){
                if(entry.getKey().equals(res)){
                    bw.write(entry.getValue() + "\n");
                } else if(entry.getValue().equals(res)){
                    bw.write(entry.getKey()+"\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

// 문제 해결
import java.io.*;
import java.util.*;

public class num_1620 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] count = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // 1.
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> reMap = new HashMap<>();

        for(int i = 1; i <= count[0]; i++ ){
            String name = br.readLine();
            map.put(name, i);
            reMap.put(i, name);
        }

        // 2.
        for(int i = 0; i < count[1]; i++){
            String res = br.readLine();

            if(res.charAt(0) >= '0' && res.charAt(0) <= '9'){
                int n = Integer.parseInt(res);
                bw.write(reMap.get(n) + "\n");
            } else {
                bw.write(map.get(res) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}