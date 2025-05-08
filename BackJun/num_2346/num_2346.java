package BackJun;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque1 = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();

        for(int i = 1; i <= N; i++){
            deque1.offer(i);
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            deque2.offer(Integer.parseInt(st.nextToken()));
        }

        while(!deque1.isEmpty()){
            sb.append(deque1.pollFirst()).append(" ");

            int move = deque2.pollFirst();

            if(deque1.isEmpty()) break;

            if(move > 0){
                for(int i = 0; i < move - 1; i++){
                    deque1.offer(deque1.pollFirst());
                    deque2.offer(deque2.pollFirst());
                }
            } else {
                for(int i = 0; i < Math.abs(move); i++){
                    deque1.offerFirst(deque1.pollLast());
                    deque2.offerFirst(deque2.pollLast());
                }
            }
        }

        System.out.println(sb.toString().trim());

        br.close();
    }
}

