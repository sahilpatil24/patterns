public class Slide {
  /*
  // brute force
  public static int maxVowels(String s, int k) {
    int max = 0;
    for(int i = 0; i <= s.length() - k; i++) { 
      int vowelcount = 0;
      for(int j = i; j < k + i; j++) { 
        char ch = s.charAt(j);
        if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
        vowelcount++;
      }
      } 
      max = Math.max(vowelcount, max);
      }
      return max;
      }
    */
   
    //optimal
    public static int maxVowels(String s, int k) {
    int max = 0;
    
    int left = 0;
    int right = 0;
    int count = 0;
    while(right < s.length()) {

      char ch = s.charAt(right);
      System.out.println("current character is " + ch);
      if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
        count++;
      }
      System.out.println("the count is " + count);
      System.out.println("max is " + max);
      System.out.println("left before is " + left);
      System.out.println("right before is " + right);
      max = Math.max(count, max);
      if(right == left + k - 1) {
        char ch2 = s.charAt(left);
        left++;
        if(ch2 == 'a' || ch2 == 'i' || ch2 == 'e' || ch2 == 'o' || ch2 == 'u')
          count--; //i have to only subtract if s.charAt(left) is a vowel and if it is not then i have to keep it as it is      
      }
      right++;
      System.out.println("left after is " + left);
      System.out.println("right after is " + right + "\n\n");
    }
    
    return max;
  }

  

  public static void main(String[] args) {
    // System.out.println(maxVowels("aeiou",2));
    // System.out.println(maxVowels("leetcode",3));
    System.out.println(maxVowels("weallloveyou",4));
  }  
}
