public class Pattern7 {
  public static void main(String[] args) {
        int n = 5;
        int i;
        for(int x = 0; x < n; x++) {

          for(i = 0; i < n - x - 1; i++) {
            System.out.print("x");
          }
        
          for(int j = 0; j < 2 * x + 1; j++) {
            System.out.print("*"); 
            
        }
        System.out.println();
    }
  }
}



/*

Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



    *
   ***
  *****
 *******
*********


Print the pattern in the function given to you.

Spaces = n - row - 1
Stars  = 2 × row + 1

*/