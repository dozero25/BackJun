import java.io.*;
import java.math.BigInteger;

public class num_10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(BigInteger.ZERO);
            return;
        } else if (N == 1) {
            System.out.println(BigInteger.ONE);
            return;
        }

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger result = BigInteger.ZERO;

        for (int i = 2; i <= N; i++) {
            result = a.add(b);
            a = b;
            b = result;
        }
        System.out.println(result);
    }
}
