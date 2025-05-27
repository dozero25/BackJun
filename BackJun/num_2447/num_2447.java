import java.io.*;
import java.util.Arrays;

public class num_2447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[][] ch = new char[N][N];

        for(int i =0; i<ch.length; i++){
            Arrays.fill(ch[i], '*');
        }

        removeStar(ch, 0, 0, N);

        for(int i =0; i<ch.length; i++){
            System.out.println(new String(ch[i]));
        }
        br.close();
    }

    public static void removeStar(char[][] ch, int x, int y, int size){

        if(size == 1) return;

        int step = size / 3;

        for(int i = x + step; i < x + 2 * step; i++){
            for(int j = y + step; j < y + 2 * step; j++){
                ch[i][j] = ' ';
            }
        }

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                if(i == 1 && j == 1) continue;
                removeStar(ch, x + i * step, y + j * step, step);
            }
        }
    }
}
