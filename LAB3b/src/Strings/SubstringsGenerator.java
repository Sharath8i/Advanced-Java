package Strings;
import java.util.*;
public class SubstringsGenerator {
	public static List<String> allSubstrings(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));
                list.add(sb.toString());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(allSubstrings("abc")); // [a, ab, abc, b, bc, c]
    }
}
