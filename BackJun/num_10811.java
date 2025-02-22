
import java.util.Scanner;

public class num_10811 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int pocket = sc.nextInt();
        int num = sc.nextInt();

        int[] arr = new int[pocket];

        for(int i = 0; i < pocket; i++){
            arr[i] = i + 1;
        }

        for(int i = 0; i < num; i++){
            int c1 = sc.nextInt() - 1;
            int c2 = sc.nextInt() - 1;

            for(int j = c1; j < c2; j++, c2--){
                int temp = arr[j];
                arr[j] = arr[c2];
                arr[c2] = temp;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
