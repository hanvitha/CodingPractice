package easy;

import java.util.HashMap;

public class RomanToInt {

	public static void main(String[] args) {
		System.out.println(romanToInt("XCI"));
	}

	public static int romanToInt(String s) {
		if(s == "" || s=="nulla"){
			return 0;
		}
		int num = 0, i = s.length()-1;
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		m.put('M', 1000);
		m.put('D', 500);
		m.put('C', 100);
		m.put('L', 50);
		m.put('X', 10);
		m.put('V', 5);
		m.put('I', 1);
		
		while(i>=0){
			if(i>0 && m.get(s.charAt(i))> m.get(s.charAt(i-1))){
				num += m.get(s.charAt(i))- m.get(s.charAt(i-1));
				i--;
			}else
				num += m.get(s.charAt(i));
			i--;
		}
		
		return num;
	}
}
