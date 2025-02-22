
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num_2563 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String[][] intArr = new String[100][100];
        for(int i = 0; i < intArr.length; i++){
            Arrays.fill(intArr[i], "x");
        }

        for(int i = 0; i < count; i++){
            String[] arr = br.readLine().split(" ");

            int n1 = Integer.parseInt(arr[0]);
            int n2 = Integer.parseInt(arr[1]);

            for(int j = n1; j < n1 + 10; j++){
                for(int z = n2; z < n2 + 10; z++){
                    intArr[j][z] = "o";
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < intArr.length; i++){
            for(int j = 0; j < intArr[i].length; j++){
                if(intArr[i][j].equals("o")){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
