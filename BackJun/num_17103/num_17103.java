import java.io.*;

public class num_17103 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        // 1.
        for(int i = 0; i < testcase; i++) {
            // 1-1.
            int n = Integer.parseInt(br.readLine());
            boolean[] prime = new boolean[n + 1];

            calcPrime(prime);

            int count = 0;

            // 1-3.
            for(int j = 2; j <= n/2; j++){
                if(!prime[j] && !prime[n - j]){
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    // 1-2.
    public static void calcPrime(boolean[] isNotPrime){
        isNotPrime[0] = isNotPrime[1] = true;

        int n = isNotPrime.length;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(!isNotPrime[i]){
                for(int j = i * i; j < n; j += i){
                    isNotPrime[j] = true;
                }
            }
        }
    }
}

public class num_17103_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());
        // 2-1.
        int[] input = new int[testcase];
        int max = 0;

        for(int i = 0; i < testcase; i++){
            input[i] = Integer.parseInt(br.readLine());
            if(input[i] > max){
                max = input[i];
            }
        }

        boolean[] isNotPrime = new boolean[max + 1];
        calcPrime(isNotPrime);

        // 2-2.
        for(int n : input){
            int count = 0;
            for(int i = 2; i <= n/2; i++){
                if(!isNotPrime[i] && !isNotPrime[n - i]){
                    count++;
                }
            }
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void calcPrime(boolean[] isNotPrime){
        isNotPrime[0] = isNotPrime[1] = true;

        int n = isNotPrime.length;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(!isNotPrime[i]){
                for(int j = i * i; j < n; j += i){
                    isNotPrime[j] = true;
                }
            }
        }
    }
}









