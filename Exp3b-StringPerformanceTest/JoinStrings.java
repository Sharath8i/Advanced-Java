/*Question: Write a method that joins an array of strings with a specified delimiter, without using
built-in join methods. Input: ["apple", "banana", "cherry"], delimiter: ", "
Output: "apple, banana, cherry" Input: ["Java", "is", "fun"], delimiter: "-"
Output: "Java-is-fun" */

package Strings;

public class JoinStrings {
	public static String join(String[] arr, String delimiter) {
        if (arr.length == 0) return "";
        StringBuilder sb = new StringBuilder(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append(delimiter).append(arr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(join(new String[]{"apple", "banana", "cherry"}, ", "));
        System.out.println(join(new String[]{"Java", "is", "fun"}, "-"));
    }
}


