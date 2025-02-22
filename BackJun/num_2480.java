
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class num_2480 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        int m = 0;

        int price = 0;

        for(int i = 0; i < 3; i++){
            int num = sc.nextInt();

            String key = String.valueOf(num);

            m = Math.max(m, num);

            map.put(key, map.getOrDefault(key, 0) +1);
        }

        for(String key : map.keySet()){
            int n = Integer.parseInt(key);
            if(map.size() == 1){
                price = 10000 + n * 1000;
                break;
            } else if(map.size() == 2 && map.get(key) == 2){
                price = 1000 + n * 100;
                break;
            } else if(map.size() == 3){
                price = m *100;
                break;
            }
        }

        System.out.println(price);

    }
}
