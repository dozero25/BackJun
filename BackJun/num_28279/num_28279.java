import java.io.*;
import java.util.*;

public class num_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < N; i++){
            int[] x = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int res = x[0];

            switch (res) {
                case 1 :
                    deque.offerFirst(x[1]);
                    break;
                case 2 :
                    deque.offerLast(x[1]);
                    break;
                case 3 :
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                    break;
                case 4 :
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case 5 :
                    sb.append(deque.size()).append("\n");
                    break;
                case 6 :
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7 :
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;
                case 8 :
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);

        br.close();
    }
}

