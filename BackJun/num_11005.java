
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class num_11005 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        List<Integer> list = new ArrayList<>();

        while(true){
            list.add(num1 % num2);
            num1 = num1 / num2;

            if(num1 == 0){
                break;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) >= 0 && list.get(i) < 10){
                sb.append(list.get(i));
            } else {
                char ch = (char)(list.get(i) + 55);
                sb.append(ch);
            }
        }
        bw.write(sb.reverse().toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
