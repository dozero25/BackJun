
import java.io.*;

public class num_4134 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        // 1.
        for(int i = 0; i < cnt; i++){
            long pri = Long.parseLong(br.readLine());

            for(long j = pri; j < j + 1; j++){
                if(calcPrimeNumber(j)){
                    bw.write(j+"\n");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
    // 2.
    public static boolean calcPrimeNumber(long n){
        if(n < 2){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}




