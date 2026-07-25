package Stack;
import java.util.Stack;

public class ValidParenthesis {
  public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        int i = 0;
        for(; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current == ')' || current == '}' || current == ']') {
              if(st.isEmpty()) {
                 return false;
              }
              if(current == st.peek()) {
                System.out.println(st.pop());
                System.out.println();
              }
              else return false;
              
              System.out.println(st);
            }

            //pushing logic
            if(current == '(') st.push(')');
            else if(current == '{') st.push('}');
            else if(current == '[') st.push(']');

            System.out.println(st);
          }
          
        //   while(!st.isEmpty()) {
        //     char current = s.charAt(i);
        //     //pop logic
        //     System.out.println("current is " + current);
        //     if(current == st.peek()) 
        //       {
        //         System.out.println(st.pop());
        //         System.out.println();
        //       }
        //       else return false;
        //       i++;
        //       System.out.println(st);
        // }

        return st.isEmpty();

    }

  public static void main(String[] args) {
    System.out.println(isValid("([])"));
  }
}