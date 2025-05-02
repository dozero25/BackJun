import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class num_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 1; i <= N; i++){
            deque.offer(i);
        }

        while (deque.size() > 1) {
            deque.poll();
            deque.offer(deque.poll());
        }

        System.out.println(deque.peek());

        br.close();
    }
}

