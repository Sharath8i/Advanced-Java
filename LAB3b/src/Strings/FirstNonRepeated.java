package Strings;

public class FirstNonRepeated {
	public static Character firstNonRepeat(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        for (char c : s.toCharArray()) if (freq[c] == 1) return c;
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeat("swiss")); // w
        System.out.println(firstNonRepeat("aabb"));  // null
    }
}
