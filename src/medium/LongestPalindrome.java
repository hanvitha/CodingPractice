package medium;

public class LongestPalindrome {

	public static String longestPalindrome(String s) {
		int t;
		int start = 0;
		int end = 0;
		String res = "";
		if (s.length() == 0)
			return "";
		for (int i = 0; i < s.length(); i++) {
			t = 1;
			int st = 0;
			int e = 0;
			while (i - t >= 0 && i + t < s.length() && (s.charAt(i - t) == s.charAt(i + t))) {
				st = i - t;
				e = i + t;
				t++;
			}
			if (e - st > end - start) {
				start = st;
				end = e;
			}
			
			t = 1;
			while (i - t >= 0 && i + t - 1 < s.length() && s.charAt(i - t) == s.charAt(i + t - 1)) {
				st = i - t;
				e = i + t - 1;
				t++;
			}
			if (e - st > end - start) {
				start = st;
				end = e;
			}
		}
		res = s.substring(start, end + 1);
		return res;
	}

	public static void main(String[] args) {
		 System.out.println(longestPalindrome("aabbbccccdddeeeedddccccbbbaa"));
		 System.out.println(longestPalindrome("jesuss"));
		System.out.println(longestPalindrome("ttarrrttttrrrattss"));
	}

}
