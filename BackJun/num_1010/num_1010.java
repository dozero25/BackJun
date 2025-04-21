
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class num_1010 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            long N = num[0];
            long M = num[1];

            bw.write(calc(N, M) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    // 1.
    public static BigInteger calc(long n, long m){

        BigInteger w = BigInteger.ONE;
        BigInteger e = BigInteger.ONE;
        BigInteger m_n = BigInteger.ONE;

        for(int i = 1; i <= m; i++){
            e = e.multiply(BigInteger.valueOf(i));

            if(i <= n){
                w = w.multiply(BigInteger.valueOf(i));
            }
            if(i <= m - n){
                m_n = m_n.multiply(BigInteger.valueOf(i));
            }
        }

        BigInteger res = BigInteger.ONE;
        w = w.multiply(m_n);
        res = e.divide(w);

        return res;
    }
}

