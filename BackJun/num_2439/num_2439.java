
import java.io.*;

public class num_2439 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int cnt = Integer.parseInt(br.readLine());

        // 1.
        for(int i = 0; i < cnt; i++){
            for(int j = 1; j < cnt - i; j++){ // 0 1 2 3
                bw.write(" ");
            }
            for(int k = 0; k <= i; k++){ // 4
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
