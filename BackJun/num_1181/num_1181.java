
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class num_1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        // 1.
        Set<String> set = new HashSet<>();

        for(int i = 0; i < count; i++){
            set.add(br.readLine());
        }
        String[] arr = set.toArray(new String[0]);

        // 2.
        Arrays.sort(arr, (n1, n2) -> {
            return n1.length() - n2.length();
        });

        // 3.
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){

                // 3-1.
                if(arr[i].equals(arr[j])){
                    break;
                }
                String str1 = arr[i];
                String str2 = arr[j];

                // 3-2.
                if(str1.length() == str2.length()){
                    for(int z = 0; z < str1.length(); z++){

                        // 3-2-1.
                        char str1_ch = str1.charAt(z);
                        char str2_ch = str2.charAt(z);

                        // 3-2-2.
                        if(str1_ch > str2_ch){
                            break;
                        } else if(str1_ch < str2_ch){
                            arr[i] = str2;
                            arr[j] = str1;
                        }
                    }
                }
            }
        }

        // 4.
        for(String s : arr){
            bw.write(s+'\n');
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
