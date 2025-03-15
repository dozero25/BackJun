
import java.io.*;
import java.math.BigDecimal;

public class num_2745 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        char[] zin = str[0].toCharArray();
        int n1 = Integer.parseInt(str[1]);

        int sum = 0;
        int c = 0;

        // 1.
        for(int i = zin.length - 1; i >= 0; i--){

            if(zin[i] >= 'A' && zin[i] <= 'Z'){
                BigDecimal bigDecimal = new BigDecimal(Math.pow(n1, c) * ((int)zin[i] - 55));
                String s = bigDecimal.toString();
                sum += Double.parseDouble(s);
                c++;
            } else {
                BigDecimal bigDecimal = new BigDecimal(Math.pow(n1, c) * ((int)zin[i] - 48));
                String s = bigDecimal.toString();
                sum += Double.parseDouble(s);
                c++;
            }
        }
        bw.write(String.valueOf((int)sum));

        br.close();
        bw.flush();
        bw.close();
    }
}
