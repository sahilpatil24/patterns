public class Reverse {
    static int reve = 0;
    static void rev(int n) {
        if(n <= 0) return;
        reve = (reve * 10) + (n % 10);
        rev(n/10);
    }

    static int rev2(int n, int res) {
        if(n <= 0) return res;
        // // System.out.println(n);
        // res = (res * 10) + (n % 10);
        // System.out.println(res);
        return rev2(n/10,res*10 + (n % 10));
    }
    
    public static void main(String[] args) {
            // rev(543);
        System.out.println(rev2(54321,0));
    }
}