package easy;

public class LongestCommPrefix {

	public static void main(String[] args) {
		String[] strs = { "abc" };
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		String s = "";
		int j = 0;
		if (strs.length == 0)
			return "";

		while (j < strs[0].length()) {
			for (String s1 : strs) {
				if (j < s1.length()) {
					if (strs[0].charAt(j) != s1.charAt(j))
						return s;

				} else
					return s;
			}
			s += strs[0].charAt(j);
			j++;
		}
		return s;
	}
}
