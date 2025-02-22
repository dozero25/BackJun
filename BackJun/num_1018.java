
import java.io.*;
import java.util.Arrays;

public class num_1018 {

    public static boolean[][] chess;
    public static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        chess = new boolean[arr[0]][arr[1]];

        for(int i = 0 ; i < chess.length; i++){
            String[] a = br.readLine().split("");

            for(int j = 0; j < chess[i].length; j++){
                if(a[j].equals("W")){
                    chess[i][j] = true;
                } else {
                    chess[i][j] = false;
                }
            }
        }

        for(int i = 0; i < arr[0] - 7; i++){
            for(int j = 0; j < arr[1] - 7; j++){
                count(i, j);
            }
        }

        bw.write(min + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void count(int s1, int s2){

        int count = 0;

        boolean a = chess[s1][s2];

        for(int i = s1; i < s1 + 8; i++){
            for(int j = s2; j < s2 + 8; j++){
                if(a != chess[i][j]){
                    count++;
                }
                a = !a;
            }
            a = !a;
        }
        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }
}
