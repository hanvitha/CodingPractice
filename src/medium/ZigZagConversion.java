package medium;

import java.util.ArrayList;

public class ZigZagConversion {

	public static void main(String[] args) {
		System.out.println(convert("PAYPAL", 3));
	}

	public static String convert(String s, int numRows) {
		StringBuffer r = new StringBuffer();
		ArrayList<Character> a[] = new ArrayList[numRows];
		
		for(int j=0;j<numRows ; j++){
			a[j] = new ArrayList<Character>();
		}
		
		int t = 0;
		int i =0;
		if(numRows ==1)
			return s;
		while(i < s.length() && t==0) {
			while(i < s.length() && t<numRows){
				a[t].add(s.charAt(i));
				t++;
				i++;
			}
			t = numRows-2;			
			while(i < s.length() && t>0){
				a[t].add(s.charAt(i));
				i++;
				t--;
			}
		}
		
		for(int j=0;j<numRows ; j++){
			for(int k=0;k < a[j].size() ; k++) 
				r.append(a[j].get(k));
		}

		return r.toString();
	}
}
