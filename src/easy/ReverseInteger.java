package easy;

public class ReverseInteger {

	public static int reverse(int x) {
		long r = 0;
		while (x != 0) {
			r = 10 * r + x % 10;
			x = x / 10;
			if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE)
				return 0;
		}
		return (int) r;
	}

	public static void main(String args[]) {
		System.out.println(reverse(-11222));
	}
}
