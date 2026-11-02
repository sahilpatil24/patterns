public class Palindrome {
    static boolean palin(int l, int r, String str) {
        if(l == r) return true;
        if(l-r+1 == 0) return  str.charAt(l) == str.charAt(r);
        return (str.charAt(l) == str.charAt(r)) && palin(l+1, r-1, str); 
    }

    public static void main(String[] args) {
        String x = "yapay";
        System.out.println(palin(0,x.length()-1,x));
    }
}