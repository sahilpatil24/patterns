public class Pattern {
    public static void print(int n, int m) {
        if(m == 0) {
            if(n == 0) return;
            System.out.println();
            print(--n, n);
            return;
        }
        System.out.print("*");
        print(n, --m);
    }

    public static void print2(int n, int m) {
        if(m == 0) {
            if(n == 0) return;
        System.out.print("*");
            print(--n, n);
            return;
        }
            System.out.println();
        print(n, --m);
    }
    public static void main(String[] args) {
        // print(4,4);
        print2(4,1);
    }
}