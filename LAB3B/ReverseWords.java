/*1. Question: Implement a method using StringBuffer to reverse every word in a sentence while
maintaining the word order. Input: "Java programming is fun"
Output: "avaJ gnimmargorp si nuf" Input: "Hello World"
Output: "olleH dlroW" */

package Strings;

public class ReverseWords {
	 public static String reverseWords(String sentence) {
	        String[] words = sentence.split(" ");
	        StringBuffer result = new StringBuffer();
	        for (int i = 0; i < words.length; i++) {
	            result.append(new StringBuffer(words[i]).reverse());
	            if (i < words.length - 1) result.append(" ");
	        }
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println(reverseWords("Java programming is fun")); // avaJ gnimmargorp si nuf
	    }
}
