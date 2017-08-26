package medium;

public class StringToInteger {

	public static void main(String[] args) {

		System.out.println(myAtoi("-9223372036854775809"));
	}

	public static int myAtoi(String str) {
		str = str.trim();
		int sign = 1, i = 0;
		long r = 0;
		if (str.length() == 0)
			return 0;

		if (str.charAt(i) == '-') {
			sign = -1;
			str = str.substring(1, str.length());
		} else if (str.charAt(i) == '+') {
			sign = 1;
			str = str.substring(1, str.length());
		}
		if (str.length() == 0)
			return 0;

		while (i < str.length()) {
			if (!Character.isDigit(str.charAt(i)))
				return (int) r * sign;

			r = r * 10 + str.charAt(i) - '0';
			i++;
			if (r*sign > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			else if (r*sign < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
		}

		return (int) r * sign;
	}
}
