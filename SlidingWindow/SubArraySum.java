package SlidingWindow;

import java.util.HashMap;

public class SubArraySum {

  public static int subarraysDivByK(int[] nums, int k) {
    //variable declaration
    HashMap<Integer,Integer> map = new HashMap<>();
    int count = 0;
    int n = nums.length;
    int sum = 0;
    
    int i = 0;
    
    map.put(0,1);
    
    
    //map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    // if(map.containsKey(((sum % k) + k)  % k)) count++;
    // map.put(sum,map.getOrDefault(sum%k,0)+1);
    // System.out.println("Map is " + map);
    // System.out.println("count is " + count);
    
    while(i < n) {
      //prefix sum logic
      System.out.println("iteration " + i + ", sum is " + sum);
      sum += nums[i];
      System.out.println("iteration " + i + ", sum is " + sum);

      //conditions
    int rem = ((sum % k) + k)  % k;
      if(map.containsKey(rem)) count += map.get(rem);
      map.put(rem,map.getOrDefault(rem,0)+1);
      System.out.println("Map is " + map);
      System.out.println("count is " + count);
      System.out.println("current is " + nums[i]  + "\n\n");
      
      i++;
    }

    return count;
  
    }

  public static int subarraySum(int[] nums, int k) {
    //variable declaration
    HashMap<Integer,Integer> map = new HashMap<>();
    int count = 0;
    int n = nums.length;
    int sum = 0;
    // int sum[] = new int[n];
    int i = 1;
    sum += nums[0];
    
    
    
    //map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    if(sum == k || map.containsKey(sum - k)) count++;
    map.put(sum,map.getOrDefault(sum,0)+1);
    // System.out.println(map);
    while(i < n) {
      //prefix sum logic
      sum += nums[i];
      System.out.println(sum);

      //conditions
      if(sum == k) count++; 
      if(map.containsKey(sum - k)) count += map.get(sum - k);
      map.put(sum,map.getOrDefault(sum,0)+1);
      // System.out.println(map);
      
      i++;
    }

    return count;
  
    }
  public static void main(String[] args) {
    // int arr[] = {4,5,0,-2,-3,1};
    int arr[] = {-1,2,9};
    System.out.println(subarraysDivByK(arr,2)); // output 2
  }
}

/*
int arr[] = {4,5,0,-2,-3,1};

4 % 5 = 4
9 % 5 = 4
0 % 5 = 0

 */
