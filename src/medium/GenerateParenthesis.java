package medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
	}

	public static List<String> generateParenthesis(int n) {
		List<String> r = new ArrayList<String>();
		GeneratePar("", 0, 0, n, r);
		return r;
	}

	private static void GeneratePar(String s, int o, int c, int n, List<String> r) {
		if (o + c == n * 2) {
			r.add(s);
			return;
		}

		if (o < n) {
			GeneratePar(s + "(", o + 1, c, n, r);
		}
		if (c < o) {
			GeneratePar(s + ")", o, c + 1, n, r);
		}

	}
}
