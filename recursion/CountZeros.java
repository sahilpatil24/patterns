public class CountZeros {
    static int count(long n, int c) {
        if(n <= 0) return c;
        return count(n/10, n%10 == 0? ++c:c);
    }
    public static void main(String[] args) {
        System.out.println(count(30002030,0));
    }
}