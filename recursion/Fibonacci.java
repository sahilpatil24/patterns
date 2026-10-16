package recursion;

public class Fibonacci {
    public static int fib(int n) {
        int one = 0;
        int two = 1;
        int three = 0;
        for(int i = 2; i < n; i++) {
            three = one + two;
            one = two;
            two = three;
        }
        return three;
    }
    
    public static int fib_rec(int n) {
        if(n == 1) return 0;
        if(n == 3 || n == 2) return 1;
        // System.out.println(n);
        return fib_rec(n - 1) + fib_rec(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(13));
        System.out.println(fib_rec(13));
    }
}