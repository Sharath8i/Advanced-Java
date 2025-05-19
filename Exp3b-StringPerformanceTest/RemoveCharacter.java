/*Question: Write a method using StringBuffer to efficiently remove all occurrences of a given
character from a string. Input: "programming", character: 'm'
Output: "prograing" Input: "banana", character: 'a'
Output: "bnn" */

package Strings;

public class RemoveCharacter {
	 public static String removeChar(String s, char target) {
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) != target) sb.append(s.charAt(i));
	        }
	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println(removeChar("programming", 'm')); // prograing
	        System.out.println(removeChar("banana", 'a'));      // bnn
	    }
}
