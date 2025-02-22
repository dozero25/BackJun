
import java.io.*;
import java.util.Arrays;

public class num_11650 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[][] arr = new int[count][2];

        for(int i = 0; i < arr.length; i++){

            String[] arr1 = br.readLine().split(" ");

            arr[i][0] = Integer.parseInt(arr1[0]);
            arr[i][1] = Integer.parseInt(arr1[1]);


        }
        Arrays.sort(arr, (n1, n2) -> {
            if(n1[0] == n2[0]){
                return n1[1] - n2[1];
            }

            return n1[0] - n2[0];
        });

        for(int i = 0; i < arr.length; i++){
            bw.write(arr[i][0] +" " +arr[i][1] + '\n');
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
