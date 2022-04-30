package util;

class StrUtil {

    public static String join(Object[] arr) {
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            sb.append(arr[i] + ",");
        }
        sb.append(arr[n - 1]);
        return sb.toString();
    }

    public static String join(Object[] arr, String separator) {
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            sb.append(arr[i] + separator);
        }
        sb.append(arr[n - 1]);
        return sb.toString();
    }

}