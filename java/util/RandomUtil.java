package util;

class RandomUtil {

    // generate random number
    public static int randNum(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    // generate random length number
    public static int randLenNum(int length) {
        int min = (int) Math.pow(10, length - 1);
        int max = (int) Math.pow(10, length) - 1;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    // generate random string
    public static String randStr(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) (randNum(97, 122)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(randNum(1, 10));
        System.out.println(randLenNum(5));
        System.out.println(randStr(5));
    }

}