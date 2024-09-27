package oop;

public class Recursion {
    private static int factorial(int n) {//fibonacci dynamic programming(memoization) etc
        if(n == 0||n==1) return 1;//base case
        return factorial(n-1)*n;
    }
    public static void main(String[] args) {
        int n=factorial(3);
        System.out.println(n);
    }
}
