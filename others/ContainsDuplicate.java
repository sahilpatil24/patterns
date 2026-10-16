import java.util.HashSet;
//2 19

/*

i now understand that we have to use hashset or something
and we increment the left pointer once right - left + 1 == k once the right pointer crosses the k elements
without us seeing a duplicate then it means that we have to shift to the next window
so we increment left
and we use hashset to preserve the order so we can use .contains method to 
find if the previous elements that we traversed had the current element

*/

//optimal

public class ContainsDuplicate {
  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    HashSet<Integer> set = new HashSet<>();
    int l = 0; 
    
    for(int r = 0; r < nums.length; r++) {
      if(nums[l] == nums[r] || set.contains(nums[l])) {
        return true;
      }
      System.out.println("The current read character and added to hashset is " + nums[r]);
      set.add(nums[r]);
      if(r - l + 1 == k) {
        System.out.println("The integer removed from hashset is " + nums[l]);
        set.remove(nums[l]);
        l++;
      }
      }
    
    return false;
  }

  public static void main(String[] args) {
    int ayr[] = {1,2,3,1};
    System.out.println(containsNearbyDuplicate(ayr,3));

  }
}
    

//brute force
/*
public class ContainsDuplicate {
  public static boolean containsNearbyDuplicate(int[] nums, int k) {
            
        for(int i = 0; i < nums.length; i++) {
          for(int j = i + 1; j < nums.length; j++) {
            if(nums[i] == nums[j] && Math.abs(i - j) <= k) {
              return true;
            }
          }
        }
        return false;
      }
    

        */