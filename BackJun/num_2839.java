
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2839 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int num1 = Integer.parseInt(br.readLine());

        int count = 0;
        while(num1 > 0){
            if(num1 % 5 == 0){
                count += num1 / 5;
                System.out.println(count);
                break;
            }
            if(num1 < 3){
                System.out.println(-1);
                break;
            }
            num1 -= 3;
            count++;
        }

        if(num == 4 || num == 7){
            System.out.println(-1);
        } else if(num % 5 == 0){
            System.out.println(num / 5);
        } else if(num % 5 == 1 || num % 5 == 3){
            System.out.println(num / 5 +1);
        } else if(num % 5 == 2 || num % 5 == 4){
            System.out.println(num / 5 + 2);
        }
    }
}
