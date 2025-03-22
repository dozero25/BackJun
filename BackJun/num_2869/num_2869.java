
import java.io.*;

public class num_2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        double up = Integer.parseInt(arr[0]);
        double down = Integer.parseInt(arr[1]);
        double arrive = Integer.parseInt(arr[2]);

        // 1.
        int day = (int)Math.ceil((arrive - down) / (up - down));

        bw.write(day+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
