class FindMaxAverage {
  public static void main(String[] args) {
    int nums[] = {1,12,-5,-6,50,3};
    int k = 4;

    //start solution
    int sum = 0;
    for(int i = 0; i < k; i++) {
      sum += nums[i];
    }
    
    System.out.println(sum);
    int windowSum = sum;
    int maxSum = 0;
    int left = 0, right = k;
    while(right < nums.length) {
      windowSum = windowSum - nums[left] + nums[right];
      maxSum = Math.max(windowSum, maxSum);

      left++;
      right++;
    }

    System.out.println(maxSum);

  }
}
