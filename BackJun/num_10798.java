
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_10798 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] arr = new String[5][15];

        for(int i = 0; i < arr.length; i++){
            String[] toy = br.readLine().split("");

            for(int j = 0; j < toy.length; j++){
                arr[i][j] = toy[j];
            }
            for(int j = toy.length; j < 15; j++){
                arr[i][j] = "";
            }
        }

        boolean isFlag = true;

        int a = 0;
        int b = 0;

        while(isFlag){
            if(a == 5 && b == 14){
                break;
            } else if(a == 5){
                b++;
                a = 0;
            }
            if(!arr[a][b].equals("")){
                System.out.print(arr[a][b]);
                a++;
            } else {
                a++;
            }
        }
    }
}
