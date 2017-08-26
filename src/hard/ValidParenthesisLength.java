package hard;

public class ValidParenthesisLength {

	public static void main(String[] args) {
		System.out.println(Solution("()()(((()"));
	}

	private static int Solution(String p) {
		int sum = 0, min = 0;
		int size = p.length();
		for (char a : p.toCharArray()) {
			if (a == '(')
				sum++;
			else
				sum--;
			if (sum == -1) {
				if (min < size - sum + 1)
					min = sum;
				sum = 0;
				size = size - 1;
			}
		}
		return size - min;
	}

}
