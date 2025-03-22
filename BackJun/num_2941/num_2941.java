
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2941 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        // 1.
        String[] arr = new String[]{"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        int count = 0;

        boolean flag = true;

        // 2.
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

        // 3.
        str = str.replaceAll(" ", "");
        String[] res = str.split("");

        int arrLen = 0;

        // 4.
        for(int i = 0; i < res.length; i++){
            if(!(res[i].equals(""))){
                arrLen = res.length;
            }
        }
        System.out.println(count + arrLen);
    }

    // 2-1
    public static int countReplace(String str, String str2){
        return (str.length() - str.replace(String.valueOf(str2), "").length()) / str2.length();
    }

}

public class num_2941 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] croatia = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        int count = 0;

        for (String c : croatia) {
            while (str.contains(c)) {
                str = str.replaceFirst(c, " ");
                count++;
            }
        }

        str = str.replace(" ", "");
        count += str.length();

        System.out.println(count);
}
