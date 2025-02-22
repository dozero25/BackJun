
import java.io.*;

public class num_2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int up = Integer.parseInt(arr[0]);
        int down = Integer.parseInt(arr[1]);
        int arrive = Integer.parseInt(arr[2]);

        int day = (arrive - down) / (up - down);

        if((arrive - down) % (up - down) != 0){
            day++;
        }

        bw.write(day+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
