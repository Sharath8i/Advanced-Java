package String_Functions;

public class s7 {
	 public static String truncate(String str, int maxLength) {
	        if (str == null) {
	            return null;
	        }
	        if (str.length() <= maxLength) {
	            return str;
	        }
			// this is used to truncate the string  
	        else {
	            return str.substring(0, maxLength) + "...";
	        }
	    }

	    public static void main(String[] args) {
	        String str= "welcome to advanced java lab";
	        int maxLength = 10;
	        System.out.println("Original: " +str);
	        System.out.println("Truncated to " + maxLength + ": " + truncate(str, maxLength) ); 
	    }
}
