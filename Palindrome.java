import java.util.*;
public class Palindrome
{
    public static boolean isPalindrome(String s,int left,int right)
    {
        if(left>=right)
        {
            return true;
        }
     if (!Character.isLetterOrDigit(s.charAt(left))) 
     {
           return isPalindrome(s, left + 1, right);
      }
     if (!Character.isLetterOrDigit(s.charAt(right))) 
     {
          return isPalindrome(s, left, right - 1);
     }

        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
           return false;



        return isPalindrome(s, left + 1, right - 1);
    }
        public static void main(String args[])
        {
            String s="A man, a plan, a canal: Panama";
          System.out.println(isPalindrome(s, 0, s.length() - 1));
        }
    }