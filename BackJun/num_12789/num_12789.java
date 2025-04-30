import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> space = new Stack<>();

        int[] tickets = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // 1.
        int current = 1;

        for(int i = 0; i < tickets.length; i++){
            int stu = tickets[i];

            while (!space.isEmpty() && space.peek() == current) {
                space.pop();
                current++;
            }

            if (stu == current) {
                current++;
            } else {
                space.push(stu);
            }
        }

        while (!space.isEmpty() && space.peek() == current) {
            space.pop();
            current++;
        }

        System.out.println(current == N + 1 ? "Nice" : "Sad");

        br.close();
    }
}

