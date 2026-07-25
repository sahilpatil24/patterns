public class Ko {
  public static boolean canFinish(int[] piles, int speed, int h) {
    int i = 0;
    while(h > 0) {
      if(i >= piles.length) break;
      System.out.println("\nhour : " + h);
      System.out.println("iteration : " + i);
      System.out.println("Before\nPile[i] : " + piles[i]);
      System.out.println("Speed : " + speed);
      if(piles[i] < speed) piles[i] = 0;
      else {
        piles[i] -= speed;
      }
      System.out.println("After\nPile[i] : " + piles[i]);
      System.out.println("Speed : " + speed);
      if(piles[i] == 0) i++;
      h--;
    }
    if(piles[piles.length - 1] == 0) return true;
    return false;
  }
  public static void main(String[] args) {
    //Koko eating bananas 11 52
    // 875
    int array[] = {30,11,23,4,20};
    int h = 5;
    int speed = 30;
    //to find the minimum speed koko can eat all the piles of bananas in h hours
    // System.out.println("\n\n" + canFinish(array.clone(),speed,h));
    
    //okay now we can confirm if koko can finish eating all the piles with x speed
    //now we need to find the speed
    int start = 1;
    int end = 0;
    for(int num : array) {
      end = Math.max(num, end);
    }
    
    //now we have to perform binary search
    int mid = start + end;
    mid /= 2;
    System.out.println("\n\n" + canFinish(array.clone(),mid,h));
    if(!canFinish(array.clone(),mid,h)) {
      // System.out.println("start is : " + start);
      // System.out.println("start is : " + start);
      // System.out.println("mid is : " + mid);
      start = mid;
      start++;
      // System.out.println("mid is : " + mid);
      mid = (start + end) / 2;
      // System.out.println("\nend is : " + end);
      // System.out.println("mid is : " + mid);
      System.out.println("\n\n" + canFinish(array.clone(),mid,h));
      
    }
  }
}