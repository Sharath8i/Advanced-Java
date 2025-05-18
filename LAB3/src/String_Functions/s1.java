/*g
 1. Question: Given a string, write a method to determine if it is a palindrome (reads the same 
forward and backward), ignoring case and non-alphanumeric characters. Input: "A man, a plan, 
a canal: Panama"
Output: true Input: "race a car"
 Output: false */



package String_Functions;

public class s1 {
	 public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }
	    public static void main(String[] args) {
	        String str1 = null;
	        String str2 = "Hello";
	        String str3 = "   ";
			//to check whether the string is empty or not 
	        System.out.println("String 1 is null or empty: " + isNullOrEmpty(str1)); 
	        System.out.println("String 2 is null or empty: " + isNullOrEmpty(str2)); 
	        System.out.println("String 3 is null or empty: " + isNullOrEmpty(str3));   
	    }
}

