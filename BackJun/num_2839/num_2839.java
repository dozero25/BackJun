
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2839 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int num1 = num;

        List<Integer> list = new ArrayList<>();
        // 1.
        while(num != 0){

            if(num >= 3){
                list.add(3);
            }
            num -= 3;

            if(num == 1 || num == 2){
                list.add(num);
                break;
            }
        }

        int n = 0;
        int f = 0;
        int t = 0;

        // 2.
        Collections.sort(list);

        // 3.
        for(int i = 0; i < list.size(); i++){
            n += list.get(i);

            if(n % 5 == 0){
                f = n;
            }
            if(n % 3 == 0){
                t = n;
            }
        }
        if(f == 0 && t == 0){
            System.out.println(-1);
        } else {
            System.out.println((f / 5) + (num1 - f) / 3);
        }
    }
}
