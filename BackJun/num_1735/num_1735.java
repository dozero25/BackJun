import java.io.*;
import java.util.*;

public class num_1735 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int a1 = arr1[0];
        int a2 = arr1[1];
        int b1 = arr2[0];
        int b2 = arr2[1];

        // 1.
        int mol = (a1 * b2) + (b1 * a2);
        int dem = a2 * b2;

        int cnt = 2;

        while(cnt <= mol || cnt <= dem){
            if(mol % cnt == 0 && dem % cnt == 0){
                mol = mol / cnt;
                dem = dem / cnt;
                cnt = 2;

            } else {
                cnt++;
            }
        }

        System.out.println(mol + " " + dem);

        br.close();
    }
}


