import java.util.HashSet;


public class LengthOfLongestSubstring {

  static public int lengthOfLongestSubstring(String s) {
    
    //9 28 
    // int len = 0;
    // String substring = "";
    // for(int i = 0; i < s.length(); i++) {
      //   System.out.println(substring);
      //   len = Math.max(len, substring.length());
    //   for(int j = 0; j < substring.length(); j++) {
        
    //     if(s.charAt(i) == substring.charAt(j)) {
    //       System.out.println("comparing -> " + s.charAt(i) + " with " + substring.charAt(j));
    //       substring = "";
    //       break;
    //     }
    //   }
    //   if(substring == "")
    //     substring += s.charAt(i);
    //   System.out.println(substring);
    // }
    
    HashSet<Character> sub= new HashSet<>();

        int left = 0;
        int right = 0;
        int max = 0;
        while(right < s.length()) {
            
            if(sub.contains(s.charAt(right))) {
                sub.remove(s.charAt(left));
                left++;
            }
            
            sub.add(s.charAt(right));
            max = Math.max(max,sub.size());
            right++;
        }

        return max;
    }
  
  public static void main(String[] args) {

    System.out.println(lengthOfLongestSubstring("bbbbb"));  
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
    System.out.println(lengthOfLongestSubstring("pwwkew"));}
}
