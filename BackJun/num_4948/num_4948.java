
import java.io.*;

public class num_4948 {

    static boolean[] isNotPrime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1.
        isNotPrime = new boolean[123456 * 2 + 1];

        calcPrime(isNotPrime.length);

        while(true){
            int n = Integer.parseInt(br.readLine());

            int count = 0;

            if(n == 0){
                break;
            } else {
                for(int i = n + 1; i <= n * 2; i++){
                    if(!isNotPrime[i]){
                        count++;
                    }
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
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




