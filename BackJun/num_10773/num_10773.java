import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        // 1.
        for(int i = 0; i < K; i++){
            int k = Integer.parseInt(br.readLine());

            if(k == 0){
                stack.pop();
            } else {
                stack.push(k);
            }
        }

        int sum = stack.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        br.close();
    }
}

