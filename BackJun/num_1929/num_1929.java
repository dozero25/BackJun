
import java.io.*;
import java.util.Arrays;

public class num_1929 {

    static boolean[] isNotPrime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n1 = arr[0];
        int n2 = arr[1];

        isNotPrime = new boolean[n2 + 1];

        calcPrime(n2);

        // 2.
        for(int i = n1; i <= n2; i++){
            if(!isNotPrime[i]){
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
    // 1.
    public static void calcPrime(int n){

        isNotPrime[0] = isNotPrime[1] = true;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(!isNotPrime[i]){
                for(int j = i * i; j <= n; j += i){
                    isNotPrime[j] = true;
                }
            }
        }
    }
}




