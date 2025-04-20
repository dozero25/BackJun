
import java.io.*;

public class num_13909 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(findLineNumber(n));

        br.close();
    }

    // 1.
    public static int findLineNumber(int input){
        int n = 1;
        while(true){
            int start = n * n - n + 1;
            int end = n * n + n * 2;
            if(input >= start && input <= end){
                return n;
            }
            n++;
        }
    }
}




