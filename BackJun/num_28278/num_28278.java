
import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class num_28278 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = arr[0];

            // 1.
            if(n == 1){
                stack.push(arr[1]);
            } else if(n == 2){
                if(stack.isEmpty()){
                    bw.write(-1 + "\n");
                } else {
                    bw.write(stack.pop() +"\n");

                }
            }else if(n == 3){
                bw.write(stack.size()+"\n");

            }else if(n == 4){
                if(stack.isEmpty()){
                    bw.write(1 +"\n");
                } else {
                    bw.write(0 + "\n");
                }
            }else {
                if(stack.isEmpty()){
                    bw.write(-1 + "\n");
                } else {
                    bw.write(stack.peek()+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

