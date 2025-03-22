import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

// 런타임 에러
public class num_11478 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        String str = br.readLine();

        int len = 1;
        int s = 0;
        // 1.
        while(len <= str.length()){

            try {
                map.put(str.substring(s, s + len), 0);
            } catch (Exception e) {
                e.printStackTrace();
            }

            s++;

            if(s == str.length()){
                len++;
                s = 0;
            }
        }

        map.put(str, 0);
        System.out.println(map.size());

        br.close();
    }
}

// 풀이 성공
public class num_11478 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        // 1.
        Set<String> set = new HashSet<>();

        // 2.
        for (int len = 1; len <= str.length(); len++) {
            for (int i = 0; i + len <= str.length(); i++) {
                set.add(str.substring(i, i + len));
            }
        }

        System.out.println(set.size());

        br.close();
    }
}