/*Question: Implement a method that concatenates alternating characters from two input strings.
If one string is longer than the other, append the remaining characters. Input: "abc", "123"
Output: "a1b2c3" Input: "hello", "world!"
Output: "hweolrllod!" */

package Strings;

public class Amerge {
	public static String mergeAlternately(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < a.length() || i < b.length()) {
            if (i < a.length()) sb.append(a.charAt(i));
            if (i < b.length()) sb.append(b.charAt(i));
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "123")); // a1b2c3
        System.out.println(mergeAlternately("hello", "world!")); // hweolrllod!
    }
}

