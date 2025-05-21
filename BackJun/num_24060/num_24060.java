import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_24060 {

    static int count = 0;
    static int K = 0;
    static int ak = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[A[0]];
        K = A[1];

        for(int i = 0; i < A[0]; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(a, 0, a.length - 1);

        System.out.println(ak);

        br.close();
    }
    public static void mergeSort(int[] A, int p, int r){
        if(p < r){
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void merge(int[] A, int p, int q, int r){
        int i = p;
        int j = q + 1;
        int t = 0;

        int[] tmp = new int[r - p + 1];

        while(i <= q && j <= r){
            if(A[i] <= A[j]){
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }

        while(i <= q){
            tmp[t++] = A[i++];
        }

        while(j <= r){
            tmp[t++] = A[j++];
        }

        t = 0;
        for(int z = p; z <= r; z++){
            A[z] = tmp[t++];
            count++;
            if(count == K){
                ak = A[z];
            }
        }
    }
}
