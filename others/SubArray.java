public class SubArray {
  /*
  //brute force  
  public static int numOfSubarrays(int[] arr, int k, int threshold) {
    //for brute force we just generate all the subarrays 
    // and check if their average is greater or equal to the 
    // threshold if yes then count++ or else nothing
    int count = 0;
    int sum = 0;
    int avg = 0;
    for(int i = 0; i < arr.length - k + 1; i++) {
      sum = 0;
      avg = 0;
      for(int j = i; j < k + i; j++) {
        sum += arr[j];
      }
      avg = sum / k;
      if(avg >= threshold) {count++; };
      System.out.println("The threshold is " + threshold);
      System.out.println("The avg is " + avg);
      System.out.println("The sum is " + sum);
      System.out.println("The count is " + count + "\n\n");
    }

    return count;    
  }
  */
 //optimal
 
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0; 
        int sum = 0;
        int count = 0;
        for(int r = 0; r < arr.length; r++) {
            sum += arr[r];
            if(r - l + 1 == k) {
                if(sum >= threshold * k) {
                    count++;
                }
                sum -= arr[l];
                l++;
            }
        }
        return count;
    }

 
  public static void main(String[] args) {
    // int ayr[] = {11,13,17,23,29,31,7,5,2,3};
    // int x = numOfSubarrays(ayr,3,5);
    int ayr[] = {2,2,2,2,5,5,5,8};
    int x = numOfSubarrays(ayr,3,4);
    System.out.println(x);
  }
}



/*    
 public static int numOfSubarrays(int[] arr, int k, int threshold) {
   
   int count = 0;
   int left = 0, right = 0;
   int sum = 0;
   int avg = 0;
   
   for(; right < arr.length; right++) {
     sum += arr[right];
     if(right == left + k - 1) {
      avg = sum / k;
      if(avg >= threshold) {count++; };
      
      sum = sum - arr[left];
      left++;
    }

    
    right++;
    }
    return count;
   }

 


*/