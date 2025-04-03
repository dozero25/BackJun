import java.io.*;
import java.util.*;

public class num_2485 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1.
        int c = Integer.parseInt(br.readLine());

        int[] arr = new int[c];
        
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < c; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int index = 0;

        while(index < c - 1){
            list.add(arr[index + 1] - arr[index]);
            index++;
        }

        // 3.
        int gcdValue = gcd(list);

        System.out.println((arr[c - 1] - arr[0]) / gcdValue + 1 - arr.length);

        br.close();
    }

    // 2.
    public static int gcd(List<Integer> l){

        int index = 0;
        int div = 2;
        int value = 1;

        while(l.get(index) >= div){
            if(l.get(index) % div == 0){
                l.set(index, l.get(index) / div);
                index++;
            } else {
                div++;
                index = 0;
            }

            if(index == l.size()){
                value = value * div;
                index = 0;
            }
        }
        return value;
    }
}

// 유클리드 호제법 사용
public class num_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());
        int[] arr = new int[c];

        for (int i = 0; i < c; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 인접한 나무 간의 거리 차이 계산
        int gcdValue = arr[1] - arr[0]; // 첫 번째 간격을 초기 GCD로 설정

        for (int i = 2; i < c; i++) {
            gcdValue = gcd(gcdValue, arr[i] - arr[i - 1]);
        }

        // 총 심어야 할 나무 개수 계산
        int totalTrees = (arr[c - 1] - arr[0]) / gcdValue + 1;
        int newTrees = totalTrees - c; // 기존 나무를 제외한 새로 심어야 할 나무 개수

        System.out.println(newTrees);
        br.close();
    }

    // 3. 유클리드 호제법을 이용한 GCD 계산 함수
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}





