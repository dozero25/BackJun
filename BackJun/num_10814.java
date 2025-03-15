
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_10814 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        String str;

        // 1.
        int count = Integer.parseInt(br.readLine());

        String[][] arr = new String[count][2];

        for(int i = 0; i < arr.length; i++){
            str = br.readLine();
            st = new StringTokenizer(str);
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        // 2.
        Arrays.sort(arr, (n1, n2) -> {
            return Integer.parseInt(n1[0]) - Integer.parseInt(n2[0]);
        });

        for(int i = 0; i < arr.length; i++){
            bw.write(arr[i][0] +" "+arr[i][1] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
