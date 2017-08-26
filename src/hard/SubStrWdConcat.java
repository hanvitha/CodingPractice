package hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubStrWdConcat {

	public static void main(String[] args) {
		String[] s = { "foo","bar"};
		System.out.println(findSubstring("foobarfoobar", s));
	}

	public static List<Integer> findSubstring(String s, String[] words) {
		List<Integer> r = new ArrayList<Integer>();
		if (s.length() == 0 || words.length == 0)
			return r;
		findSubstring1(r, s, "", words, new boolean[words.length], words.length);
		Collections.sort(r);
		return r;
	}

	private static void findSubstring1(List<Integer> r, String s, String newConcatStr, String[] words, boolean[] b,
			int count) {
		if (count == 0) {
			int index = s.indexOf(newConcatStr);
			while (index >= 0) {
				if (!r.contains(index))
					r.add(index);
				index = s.indexOf(newConcatStr, index + 1);
			}
		} else {
			for (int j = 0; j < words.length; j++) {
				if (!b[j]) {
					b[j] = true;
					findSubstring1(r, s, newConcatStr + words[j], words, b, count - 1);
					b[j] = false;
				}
			}
		}

	}
}
