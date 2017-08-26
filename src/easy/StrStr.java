package easy;

public class StrStr {

	public static void main(String[] args) {
		System.out.println(strStr("hanvitha", "vit"));
	}

	public static int strStr(String s1, String s2) {
		
		
		for(int i=0;;i++){
			for(int j=0;;j++){
				if(j==s2.length()) return i;
				if(i+j == s1.length()) return -1;
				if(s1.charAt(i+j) != s2.charAt(j)) break;				
			}
		}
	}
}
