package medium;

public class MultiplyStrings {

	public static void main(String[] args) {
		System.out.println(multiply("123", "4"));
	}

	public static String multiply(String n1, String n2) {
		int len1 = n1.length();
		int len2 = n2.length();
		int[] prod = new int[len1 + len2];

		for (int i = len1 - 1; i >= 0; i--) {
			for (int j = len2 - 1; j >= 0; j--) {
				int index = len1 + len2 - i - j - 2;
				prod[index] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
				prod[index + 1] += prod[index] /10;
				prod[index] %= 10;
			}
		}
		StringBuilder s = new StringBuilder();
		for (int i = prod.length - 1; i >0; i--) {
			if (s.length() == 0 && prod[i] == 0)
				continue;
			System.out.println(s);
			s.append(prod[i]);
		}
		System.out.println(s);
		s.append(prod[0]);
		return s.toString();
	}
}
