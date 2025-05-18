/*Write a Java Program for Capitalizing the first letter of each word. using user defined function
<<<<<<< HEAD
capitalizeWords() */
=======
capitalizeWords()*/


>>>>>>> dd706ae782b347f1c09244301140b138da18e75c

package String_Functions;

public class s6 {
	public static String capitalizeWords(String str) {
        String result = "";
        boolean firstletter = true;
        // this is used to citalize the first letter of each word
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                result += c;
                firstletter = true;
            } 
            else if (firstletter) {
                result += Character.toUpperCase(c);
                firstletter = false;
            } 
            else {
                result += c;
            }
        }
        return result;
    }
	public static void main(String[]args) {
		String str = "hello world ";
	System.out.println( str + ": " + capitalizeWords(str));
}
}
