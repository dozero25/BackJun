import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            // 1.
            for (char ch : str.toCharArray()) {
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')' || ch == ']') {
                    if (stack.isEmpty() || (ch == ')' && stack.peek() != '(') || (ch == ']' && stack.peek() != '[')) {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (isValid && stack.isEmpty()) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}