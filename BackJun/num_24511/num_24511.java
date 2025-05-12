import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class num_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer struSt = new StringTokenizer(br.readLine());
        StringTokenizer elemSt = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int type = Integer.parseInt(struSt.nextToken());
            int value = Integer.parseInt(elemSt.nextToken());
            if (type == 0) {
                deque.offerFirst(value);
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer inputSt = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            deque.offerLast(Integer.parseInt(inputSt.nextToken()));
        }

        for (int i = 0; i < M; i++) {
            sb.append(deque.pollFirst()).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}