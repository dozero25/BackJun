import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        String str;

        while((str = br.readLine()) != null){
            st = new StringTokenizer(str);

            if (st.hasMoreTokens()) {
                int N = pow3(Integer.parseInt(st.nextToken()));
                char[] ch = new char[N];
                Arrays.fill(ch, '-');

                cutStr(ch, 0, ch.length);

                System.out.println(new String(ch));

            } else {
                break;
            }
        }
        br.close();
    }
    public static void cutStr(char[] ch, int start, int length){

        if(length == 1) return;

        int div  = length / 3;

        for(int i = start + div; i < start + 2 * div; i++){
            ch[i] = ' ';
        }

        cutStr(ch, start, div);
        cutStr(ch, start + 2 * div, div);
    }
    public static int pow3(int n){
        int result = 1;
        for(int i = 0; i < n; i++){
            result *= 3;
        }
        return result;
    }
}
