/*Write a Java Program for Counting the number of words in a string using user defined function
<<<<<<< HEAD
countWords() */
=======
countWords()*/


>>>>>>> dd706ae782b347f1c09244301140b138da18e75c


package String_Functions;

public class s10 {
	 public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) {
	            return 0;
	        }
	        // this is used to counts the words 
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String str1 = "hello world";
	        String str2 = "";
	        System.out.println( str1 + ": " + countWords(str1)); 
	        System.out.println(str2 + ": " + countWords(str2)); 
	       
	    }
}
