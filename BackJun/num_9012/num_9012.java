
import java.io.*;
import java.util.Stack;

public class num_9012_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        
        for(int i = 0; i < T; i++){
            Stack<String> stack = new Stack<>();

            String[] t = br.readLine().split("");

            int leftParCnt = 0;
            int rightParCnt = 0;
            // 1.
            for(int j = 0; j < t.length; j++){
                if(t[j].equals("(")){
                    stack.push(t[j]);
                    leftParCnt++;
                } else {
                    stack.push(t[j]);
                    rightParCnt++;
                }
                if(leftParCnt == rightParCnt && stack.peek().equals(")") && !stack.get(0).equals(")")){
                    stack.clear();
                    leftParCnt = 0;
                    rightParCnt = 0;
                }
            }
            
            if(stack.isEmpty()){
                bw.write("YES" + "\n");
            } else {
                bw.write("NO" + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

public class num_9012_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 1.
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();

            boolean isValid = true;
            
            for (char ch : str.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (isValid && stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}


