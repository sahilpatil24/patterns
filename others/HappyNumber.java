import java.util.HashSet;

public class HappyNumber {

  public static int sumSquare(int n) {
    int sum = 0;
    while(n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
          }
          System.out.println(sum);
          return sum;
  }
  public static boolean isHappy(int n) {
        //10 10
        //   sum = 0;
        
        // }
        HashSet<Integer> map = new HashSet<>();
        while(n != 1) {
          n = sumSquare(n);
          if(map.contains(n)) { return false; }
          map.add(n);
        }
        // if(sum == 1) return true;
        return n == 1? true: false;
    }

    public static void main(String[] args) {
      System.out.println(isHappy(12));
    }
}
