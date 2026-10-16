import java.util.HashSet;

public class Fruits {
  public static void printWindow(int left, int right,int[] fruits) {
    System.out.println("Window is ");
    while(left < right) {
      System.out.print(fruits[left] + " - ");
      left++;
    }
    System.out.println();
  }

  public static int totalFruit(int[] fruits) {
     //3 50 AM
        //3 test cases passed in 15 mins
        int left = 0;
        int right = 0;
        int max = 0;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        while(right < fruits.length) {
          System.out.println(set);
          printWindow(left,right,fruits);
            if(set.contains(fruits[right])) {
                count++;
                max = Math.max(count,max);
            }
            else {
                if(set.size() >= 2) {
                  System.out.println("reached -- element being removed is " + fruits[left]);
                    set.remove(fruits[left]);
                    for(int i = 0; i < right; i++) {
                        if(fruits[i] == fruits[left]) { count--; }
                    }
                    left++;
                }
                set.add(fruits[right]);
                count++;
                max = Math.max(count,max);
            }
            // if(right - left + 1 == 2) {
                
            // }
            
            right++;
        }       
        return max; 
    }
  public static void main(String[] args) {
    int arr[] = {4,7,7,0,8,3,8,2,5};
    System.out.println(totalFruit(arr));

  }
}


/*class Solution {
    public int totalFruit(int[] fruits) {

        int left = 0;
        int right = 0;
        int max = 0;

        HashMap<Integer,Integer> set = new HashMap<>();

        while(right < fruits.length) {

            // add current fruit
            set.put(fruits[right],
                    set.getOrDefault(fruits[right], 0) + 1);

            // shrink while invalid
            while(set.size() > 2) {

                set.put(fruits[left],
                        set.get(fruits[left]) - 1);

                if(set.get(fruits[left]) == 0) {
                    set.remove(fruits[left]);
                }

                left++;
            }

            max = Math.max(max, right - left + 1);

            right++;
        }

        return max;
    }
} */