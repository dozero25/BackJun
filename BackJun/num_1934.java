import java.io.*;
import java.util.*;

public class num_1934 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        // 1.
        List<Integer> list = new ArrayList<>();

        // 2.
        for(int c = 0; c < count; c++){

            // 2-1.
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            List<Integer> mul = new ArrayList<>();

            int a = arr[0];
            int b = arr[1];

            int div = 2;

            // 2-2.
            while(a >= div || b >= div){

                if(a % div == 0 && b % div == 0){
                    mul.add(div);

                    a = a / div;
                    b = b / div;

                    div = 2;
                } else {
                    div++;
                }
            }

            // 2-3.
            int res = 1;

            for(int i = 0; i < mul.size(); i++){
                res *= mul.get(i);
            }
            list.add(res * a * b);
        }

        // 3.
        for(int num : list){
            bw.write(num+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}