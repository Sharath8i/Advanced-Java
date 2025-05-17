package Strings;

public class InsertSpaces {
	 public static String insertEveryN(String s, int n) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < s.length(); i++) {
	            if (i > 0 && i % n == 0) sb.append(' ');
	            sb.append(s.charAt(i));
	        }
	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println(insertEveryN("ABCDEFGHIJKLMNOPQR", 4)); // ABCD EFGH IJKL MNOP QR
	        System.out.println(insertEveryN("programming", 3));        // pro gra mmi ng
	    }
	}

