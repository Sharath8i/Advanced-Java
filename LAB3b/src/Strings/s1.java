<<<<<<< HEAD
/* Question: Given a string, write a method to determine if it is a palindrome (reads the same 
forward and backward), ignoring case and non-alphanumeric characters. Input: "A man, a plan, 
a canal: Panama"
Output: true Input: "race a car"
 Output: false  */
=======
/*Given a string, write a method to determine if it is a palindrome (reads the same 
forward and backward), ignoring case and non-alphanumeric characters. Input: "A man, a plan, 
a canal: Panama"
Output: true Input: "race a car"
 Output: false */



>>>>>>> dd706ae782b347f1c09244301140b138da18e75c

package Strings;

public class s1 {
	 public static boolean isPalindrome(String s) {
	        int i = 0, j = s.length() - 1;
	        while (i < j) {
	            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
	            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
	            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
	            i++;
	            j--;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
	        System.out.println(isPalindrome("race a car")); // false
	    }
	}
	
