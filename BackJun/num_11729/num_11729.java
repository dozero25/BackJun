import java.io.*;

public class num_11729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int answer = 1;

        for(int i = 0; i < N; i++){
            answer *= 2;
            if(N - 1 == i){
                answer -= 1;
            }
        }
        bw.write(answer + "\n");
        move(N, 1, 2, 3, bw);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void move(int n, int start, int assist, int arrive, BufferedWriter bw) throws IOException {
        if(n == 1) {
            bw.write(start + " " + arrive + "\n");
            return;
        }
        move(n - 1, start, arrive, assist, bw);
        bw.write(start + " " + arrive + "\n");
        move(n - 1, assist, start, arrive, bw);
    }
}
