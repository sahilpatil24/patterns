import java.util.Arrays;

public class Koko {

  public static boolean completeInH(int hour, int piles[],int speed) {
    int i = 0;
    while(hour > 0) {
	        //speed is 4 
	        //the first pile is 3 bananas 
	        //so in the first hour we check if speed >= pile[i] 
	        //if yes then let her eat banans okay so hour++
	        //if it is not then just do pile[i] -= speed
	        //in this way we can find the hours required
	        
          System.out.println("\nhour " + hour);
          System.out.println("before\ni is " + i + " and piles[i] is " + piles[i]);
            if(speed >= piles[i]) {  piles[i] = 0;}
            else { piles[i] -= speed;  }
          System.out.println("speed is " + speed);
          System.out.println("after\ni is " + i + " and piles[i] is " + piles[i]);
	        if(piles[i] == 0) {  i++ ;}
          if(piles[piles.length - 1] == 0) break;
          hour--;
        
        
        //the problem with this is ki we cannot find speed
        //we need to just randomly guess it
        //we use binary search to guess it
        //once we do guess it then we try it it can be completed in h hours if not then 
        //we just use another using start + end / 2
        
	    	// System.out.println("\nhour " + hour);
	    	// System.out.println("before\ni is " + i + " and piles[i] is " + piles[i]);
        // if(speed >= piles[i]) {  piles[i] = 0;}
	      //   else { piles[i] -= speed;  }
        //   System.out.println("speed is " + speed);
        //   System.out.println("after\ni is " + i + " and piles[i] is " + piles[i]);
	      //   if(piles[i] == 0) {  i++; ;}  
        //   hour--;      
        // }
      }
      if(piles[piles.length - 1] == 0) return true;
      else return false;
}
  	public static void main(String[] args) {
	    int piles[] = {3,6,7,11};
	    // int piles[] = {30,11,23,4,20};
	    // int speed = 4;
	    // int hour = 5;
      // int start = 0;
      // int end = Arrays.stream(piles).max().getAsInt(); 
      
      // speed = (start + end) / 2;
      // // while(piles[piles.length - 1] != 0) {
        //   System.out.println("\nspeed " + speed);
        //   System.out.println("\nshow " + show);
	      
        
        //   if(piles[piles.length - 1] == 0) System.out.println("\n\ndone");
        //   //if not done then repeat
        //   else  { speed = (speed + end) / 2;  hour = 5; i = 0; piles = pile.clone();}
        
        // }
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int speed = (1 + Arrays.stream(piles).max().getAsInt()) / 2;
        boolean show = false;

        //handle the case where it is not true
        while(show == false) {
          System.out.println("\nspeed " + speed);
          show = completeInH(8,piles.clone(),speed);
          System.out.println(show);
          if(show == false) {speed++; speed = ((speed + end)/2); }          
        }
        
        int min = speed;
        //handle the case where it is true but need to find minimum
        
	}
}