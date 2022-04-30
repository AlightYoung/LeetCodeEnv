package algorithm;

public class GreatestCommonDivsor {

    public static int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

    public static void main(String[] args) {
        gcd(3, 19);
    }

}
