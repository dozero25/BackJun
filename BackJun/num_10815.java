package BackJun;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1.
        int c1 = Integer.parseInt(br.readLine());
        int[] ar1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int c2 = Integer.parseInt(br.readLine());
        int[] ar2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder sb = new StringBuilder();

        Map<String, Integer> map = new HashMap<>();

        // 2. 
        for(int i = 0; i < c1; i++){
            map.put(String.valueOf(ar1[i]), map.getOrDefault(String.valueOf(ar1[i]), 0) + 1);
        }

        for(int i = 0; i < c2; i++){
            map.put(String.valueOf(ar2[i]), map.getOrDefault(String.valueOf(ar2[i]), 0) + 1);
        }

        // 3.
        for(int i = 0; i < c2; i++){
            if(map.get(String.valueOf(ar2[i])) == 2){
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        String answer = sb.toString().trim();
        System.out.println(answer);

        br.close();
    }
}



