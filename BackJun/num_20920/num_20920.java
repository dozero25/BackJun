import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class num_20920_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] wordBook = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < wordBook[0]; i++){
            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toList());

        List<Map.Entry<String, Integer>> list2 = list.stream()
                .sorted((e1, e2) -> Integer.compare(e2.getKey().length(), e1.getKey().length()))
                .collect(Collectors.toList());

        List<String> list3 = list2.stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for(int i = 0; i < list3.size(); i++){
            String word = list3.get(i);
            if(word.length() >= wordBook[1]){
                bw.write(word + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

public class num_20920_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] wordBook = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < wordBook[0]; i++){
            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        List<String> list = map.entrySet().stream()
                .sorted(
                        Comparator
                                .<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue).reversed()
                                .thenComparing((e1, e2) -> Integer.compare(e2.getKey().length(), e1.getKey().length()))
                                .thenComparing(Map.Entry::getKey)
                )
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for(int i = 0; i < list.size(); i++){
            String word = list.get(i);
            if(word.length() >= wordBook[1]){
                bw.write(word + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

