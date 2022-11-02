package Homeworks.Seminar_2;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 65;
        System.out.println(isPowerOfTwo(n));

    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1 || n == 2) return true;
        if (n % 2 == 0) {
            if (n < 2) return false;
            return (isPowerOfTwo(n/2));
        } else return false;
    }
}
