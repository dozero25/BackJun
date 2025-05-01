import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class num_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>() {};

        for(int i = 0; i < N; i++){
            String[] arr = br.readLine().split(" ");

            String command = arr[0];

            switch (command) {
                case "push" :
                    int res = Integer.parseInt(arr[1]);
                    queue.addLast(res);
                    break;
                case "pop" :
                    bw.write(queue.isEmpty() ? "-1\n" : queue.pollFirst() + "\n");
                    break;
                case "size" :
                    bw.write(queue.size() + "\n");
                    break;
                case "empty" :
                    bw.write(queue.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front" :
                    bw.write(queue.isEmpty() ? "-1\n" : queue.peekFirst() + "\n");
                    break;
                case "back" :
                    bw.write(queue.isEmpty() ? "-1\n" : queue.peekLast() + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

