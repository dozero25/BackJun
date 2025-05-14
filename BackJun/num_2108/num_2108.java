import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class num_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;

        for(int i = 1; i <= N; i++){
            int key = Integer.parseInt(br.readLine());
            map.put(key, map.getOrDefault(key, 0) + 1);
            list.add(key);
            total += key;
        }

        Collections.sort(list);

        int one = (int)Math.round((double) total / N);
        System.out.println(one);

        int index = N - (N / 2);
        int two = index == 1 ? list.get(0) : list.get(index - 1);
        System.out.println(two);

        int three = findMode(map);
        System.out.println(three);

        int four = list.get(list.size() - 1) - list.get(0);
        System.out.println(four);

    }
    public static int findMode(Map<Integer, Integer> map){
        int valuesMax = Collections.max(map.values());

        List<Integer> list = map.entrySet().stream()
                .filter(e -> e.getValue() == valuesMax)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());

        int mode;

        if(list.size() == 1){
            mode = list.get(0);
        } else {
            mode = list.get(1);
        }

        return mode;
    }
}