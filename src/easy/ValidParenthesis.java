package easy;

import java.util.ArrayList;
import java.util.HashMap;

public class ValidParenthesis {

	public static void main(String[] args) {

		System.out.println(isValid("([]"));
	}

	public static boolean isValid(String s) {
		ArrayList a = new ArrayList<Character>();
		boolean r = false;
		HashMap m = new HashMap<Character, Character>();
		m.put('}', '{');
		m.put(')', '(');
		m.put(']', '[');

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '{' || c == '(' || c == '[') {
				a.add(c);
				r = false;
			} else if (c == '}' || c == ')' || c == ']') {
				if (a.size()!=0 && a.get(a.size() - 1) == m.get(c)) {
					a.remove(a.size() - 1);
					r = true;
				} else {
					return false;
				}
			}
		}
		if(a.size()!=0){
			return false;
		}else{	
			return r;
		}
	}

}
