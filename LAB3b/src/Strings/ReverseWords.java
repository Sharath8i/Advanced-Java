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
