
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class num_18870 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] answer = arr.clone();

        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(arr);

        int rank = 0;

        for(int n : arr){
            if(!map.containsKey(n)){
                map.put(n, rank);
                rank++;
            }
        }

        for(int i = 0; i < answer.length; i++){
            if(i == answer.length - 1){
                sb.append(map.get(answer[i]));
            } else {
                sb.append(map.get(answer[i])+ " ");
            }
        }

        System.out.println(sb);

        br.close();
    }
}
