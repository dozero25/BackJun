
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num_1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = 0;
        double avg = 0.0;

        for(int i = 0; i < arr.length; i++){
            max = Math.max(arr[i], max);
        }

        for(int i = 0; i < arr.length; i++){
            avg += (Double.valueOf(arr[i]) / max) * 100;
        }

        System.out.println(avg / num);
        br.close();
    }
}
