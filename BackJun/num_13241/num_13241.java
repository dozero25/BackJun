
import java.io.*;
import java.util.*;

public class num_13241 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1.
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int a = arr[0];
        int b = arr[1];

        int div = 2;

        long answer = 1;

        List<Integer> list = new ArrayList<>();

        // 2.
        while(a >= div || b >= div){

            if(a % div == 0 && b % div == 0){
                list.add(div);

                a = a / div;
                b = b / div;

                div = 2;
            } else {
                div++;
            }
        }

        // 3.
        for(int i = 0; i < list.size(); i++){
            answer *= list.get(i);
        }

        answer = answer * a * b;

        System.out.println(answer);

        br.close();
    }
}


