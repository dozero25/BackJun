
import java.io.*;
import java.util.StringTokenizer;

public class num_10951 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        String str;

        // 1.
        while ((str = br.readLine()) != null){
            st = new StringTokenizer(str);

            if(st.hasMoreTokens()){
                bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
            } else {
                break;
            }

        }

        br.close();
        bw.flush();
        bw.close();
    }
}
