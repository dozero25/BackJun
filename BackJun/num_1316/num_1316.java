
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class num_1316 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int count = 0;

        // 2.
        for(int i = 0; i < num; i++){
            String str = br.readLine();

            if(check(str)){
                count++;
            }
        }
        System.out.println(count);

        br.close();
    }

    // 1.
    public static boolean check(String str){
        // 1-1
        String[] arr = str.split("");

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }
        // 1-2
        for(String s : map.keySet()){
            int index = str.indexOf(s);

            // 1-2-1
            while(true){
                if(map.get(s) == 1){
                    break;
                }
                if(str.indexOf(s, index + 1) == -1){
                    break;
                }
                if( index + 1 == str.indexOf(s, index + 1)){
                    index = str.indexOf(s, index + 1);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
