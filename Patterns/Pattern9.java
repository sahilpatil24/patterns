public class Pattern9 {
  public static void main(String[] args) {
    int n = 5;
    System.out.println();Sol
    for(int i = n; i >= 0; i--) {

      //spaces - 4 3 2 1 0 0 1 2 3 4
      for(int sp = 0; sp < n - i - 1; sp++) {
        System.out.print(" ");
      }
      
      for(int st = 0; st < (2 * i + 1); st++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}