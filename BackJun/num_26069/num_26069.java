

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class num_26069 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> dancers = new HashSet<>();
        dancers.add("ChongChong");

        for(int i = 0; i < N; i++){
            String[] chat = br.readLine().split(" ");

            if(dancers.contains(chat[0])|| dancers.contains(chat[1])){
                dancers.add(chat[0]);
                dancers.add(chat[1]);
            }
        }
        System.out.println(dancers.size());
    }
}

