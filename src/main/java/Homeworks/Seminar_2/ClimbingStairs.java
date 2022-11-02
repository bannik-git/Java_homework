package Homeworks.Seminar_2;

public class ClimbingStairs {
    public static void main(String[] args) {
    int steps = 44;
        System.out.println(climbStairs(steps));
    }
    public static int climbStairs(int n) {
        return count(n, 1, 2);
    }
    public static int count(int n, int oneStep, int twoStep) {
        if (n == 2) return twoStep;
        if (n == 1) return oneStep;
        return count(n-1, twoStep, oneStep + twoStep);
    }
}
