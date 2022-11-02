package Homeworks.Seminar_2;

public class pow_test {
    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        double answer = myPow(x, n);
        System.out.println(answer);

    }
    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n < 0) {
            return 1/x * myPow(1/x, -n - 1);
        }
        if (n % 2 != 0) return x * myPow(x * x, n/2);
        else return myPow(x * x, n/2);
    }


}