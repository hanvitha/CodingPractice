package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LetterCombOfPhone {

	public static void main(String[] args) {

		System.out.println(letterCombinations("23"));
	}

	public static List<String> letterCombinations(String d) {
		List<String> r = new ArrayList<String>();
		HashMap<Character, List<Character>> m = new HashMap<Character, List<Character>>();
		m.put('1', null);
		m.put('2', Arrays.asList('a', 'b', 'c'));
		m.put('3', Arrays.asList('d', 'e', 'f'));
		m.put('4', Arrays.asList('g', 'h', 'i'));
		m.put('5', Arrays.asList('j', 'k', 'l'));
		m.put('6', Arrays.asList('m', 'n', 'o'));
		m.put('7', Arrays.asList('p', 'q', 'r', 's'));
		m.put('8', Arrays.asList('t', 'u', 'v'));
		m.put('9', Arrays.asList('w', 'x', 'y', 'z'));

		letComb("", d, r, m);

		return r;
	}

	private static void letComb(String s, String d, List<String> r, HashMap<Character, List<Character>> m) {
		if (d.length() == 0) {
			if (s.length() != 0) {
				r.add(s);
			}
			return;
		} else {
			if (d.charAt(0) == '1' || d.charAt(0) == '0') {
				letComb(s, d.substring(1, d.length()), r, m);
			} else {
				List<Character> c1 = m.get(d.charAt(0));
				for (char c : c1) {
					letComb(s + c, d.substring(1, d.length()), r, m);
				}
			}
		}
	}
}
