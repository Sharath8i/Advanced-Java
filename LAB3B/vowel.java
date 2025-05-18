/*Question: Implement a method that counts the number of vowels (a, e, i, o, u) in a given string,
case-insensitive. Input: "Hello World"
Output: 3 Input: "Programming Interview"
Output: 6 */

package Strings;

public class vowel {
	public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Hello World")); // 3
        System.out.println(countVowels("Programming Interview")); // 6
    }
}

