

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class num_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = NK[0];
        int k = NK[1];

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }

        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            for(int i = 0; i < k - 1; i++){
                queue.offer(queue.poll());
            }
            list.add(queue.poll());
        }

        String formatted = "<" + list.stream().map(String::valueOf).collect(Collectors.joining(", ")) + ">";

        System.out.println(formatted);

        br.close();
    }
}

