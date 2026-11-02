public class Sum {
    static int getSum(int n) {
        if(n <= 0) return 0;
        return (n%10) + getSum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(getSum(543));
    }
}

/*
543 / 10 = 54
543 % 10 = 3

*/