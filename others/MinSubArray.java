public class MinSubArray {
  public static int minSubArrayLen(int target, int[] nums) {
        //03 23 AM
        int left = 0;
        int right = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while(right < n) {
            sum += nums[right];
            System.out.println("the sum is " + sum);
            while(sum >= target) {
              sum -= nums[left];
              System.out.println("the sum is " + sum);
              left++;
              min = Math.min(min,right-left+1);
              System.out.println("the min is " + min);
            }
            right++;
        }
        return sum;
    }
  public static void main(String[] args) {
    int arr[] = {2,3,1,2,4,3};
    System.out.println(minSubArrayLen(7,arr));
    
    /*
    int arr[] = {2,3,1,2,4,3};
    2 + 3 + 1 + 2 = 8
    8 - 2 = 6
    6 + 4 = 10
    10 - 3 = 7 - 1 = 6
    

    
    */
  }
}