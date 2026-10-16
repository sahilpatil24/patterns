/* 

// class Solution {
//     public static void main(String[] args) {
//       int n = 1020304;
//       int temp = 0;
//       while (n > 0) {
//         int digit = n % 10;
//         System.out.println("\ndigit is " + digit);
//         n = n / 10;
//         temp = temp * 10 + digit;
//       }

//     System.out.println("Reversed number is " + temp);


      
      

      
      int fin = 0;
        int sum = 0;
        while(temp > 0) {
            int digit = temp % 10;
            System.out.println("\ndigit is " + digit);
            if(digit == 0) { temp = temp / 10; continue;}
            else {
                sum += digit;
                temp = temp / 10;
                fin = fin * 10 + digit;
                System.out.println("sum is " + sum);
                System.out.println("fin is " + fin);
                System.out.println("temp is " + temp);
            }
        }
        
    }
}
int nums[] = {-1,-1,0,0,-1,-1};

        //find the pivot index - 724
        for(int i = 1; i < nums.length; i++) {
          nums[i] = nums[i] + nums[i-1];
          System.out.println("nums at " + i + " is " + nums[i]);
        }

        for(int i = 1; i < nums.length - 1; i++) {
          if(nums[i - 1] == nums[nums.length - 1] - nums[i]) {
            System.out.println(i + " " + nums[i]);
            break;
          }
          System.out.println("\n\nStarting the process...");
          System.out.println(nums[nums.length - 1] - nums[i]);
          System.out.println(nums[i - 1]);
          System.out.println(i + " " + nums[i] + "\n");
          }
    }
}

*/
class Solution {
    public static void main(String[] args) {
      int nums[] = {1,1,1};
      int k = 2;

      int total = 0;
        int i = 1;
        while(i < nums.length) {
          if(nums[i] + nums[i - 1] == k) { total++; i++; continue;}
          nums[i] += nums[i - 1];

            i++;
        }
        System.out.println(total);
    }}