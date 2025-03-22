
import java.io.*;

public class num_15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        // 1.
        for(int i = 0; i < cnt; i++){
            String[] arr = br.readLine().split(" ");
            bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

}
