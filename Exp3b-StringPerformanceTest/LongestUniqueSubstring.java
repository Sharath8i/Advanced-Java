/*Question: Create a method that finds the longest substring without repeating characters in a
given string. Input: "abcabcbb"
Output: "abc" (or "cab" or "abc" - any substring of length 3 without repeating characters)
Input: "bbbbb"
Output: "b" Input: "pwwkew"
Output: "wke" (or "kew") */

package Strings;
import java.util.*;
public class LongestUniqueSubstring {
	 public static String longestUnique(String s) {
	        int[] last = new int[256];
	        int start = 0, maxLen = 0, bestStart = 0;
	        Arrays.fill(last, -1);
	        for (int i = 0; i < s.length(); i++) {
	            if (last[s.charAt(i)] >= start) start = last[s.charAt(i)] + 1;
	            last[s.charAt(i)] = i;
	            if (i - start + 1 > maxLen) {
	                maxLen = i - start + 1;
	                bestStart = start;
	            }
	        }
	        return s.substring(bestStart, bestStart + maxLen);
	    }

	    public static void main(String[] args) {
	        System.out.println(longestUnique("abcabcbb")); // abc
	        System.out.println(longestUnique("pwwkew"));   // wke
	    }
}
