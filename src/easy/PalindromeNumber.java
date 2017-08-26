package easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(222102222));
	}

	public static boolean isPalindrome(int x) {
		if(x == 0 || (x>0 && x<10))
			return true;
		
		if(x<0)
			return false;
		int t = 1, i = 0, j = 0;
		int count = 1;

		while (x / Math.pow(10, count) >= 1) {
			count++;
		}
		while (t <= count / 2) {
			i = (int) ((int) (x%Math.pow(10, t))/Math.pow(10, t-1));
			j = (int) (x/Math.pow(10, count-t))%10;
			if(i!=j){
				return false;
			}
			t++;
		}
		return true;

	}
}
