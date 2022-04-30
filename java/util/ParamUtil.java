package util;

import java.util.Arrays;

public class ParamUtil {

    
    public static Integer[] numArr(String str) {
        str = str.substring(1, str.length() - 1);
        String[] arr = str.split(",");
        int n = arr.length;
        Integer[] res = new Integer[n];
        for (int i = 0; i < n; i++) {
            try {
                res[i] = Integer.parseInt(arr[i]);
            } catch (Exception e) {
                // e.printStackTrace();
            }
        }
        return res;
    }

    public static String[] strArr(String str) {
        return str.substring(1, str.length() - 1).split(",");
    }

    
    // -------------------------------------------------
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numArr("[1,2,null,null]")));
    }


}
