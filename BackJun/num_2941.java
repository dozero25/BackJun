
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2941 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();


        String[] arr = new String[]{"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        int count = 0;

        boolean flag = true;

        while(flag){
            for(int i = 0; i < arr.length; i++){
                if(str.contains(arr[i])){
                    count += countReplace(str, arr[i]);
                    str = str.replaceAll(arr[i], " ");
                } else {
                    flag = false;
                }
            }
        }

        str = str.replaceAll(" ", "");
        String[] res = str.split("");

        int arrLen = 0;
        for(int i = 0; i < res.length; i++){
            if(res[i].equals("")){
                break;
            } else {
                arrLen = res.length;
                break;
            }
        }
        System.out.println(count + arrLen);
    }

    public static int countReplace(String str, String str2){
        return (str.length() - str.replace(String.valueOf(str2), "").length()) / str2.length();
    }
}
