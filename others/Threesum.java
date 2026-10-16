import java.util.List;

public class Threesum {
  public List<List<Integer>> threeSum(int[] nums) { }
  public static void main(String[] args) {
    threesum([1,2,-3]);
  }
}


/*
        

Map <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if(map.containsKey(need)) return new int[] {map.get(need), i};
            else map.put(nums[i],i);

*/