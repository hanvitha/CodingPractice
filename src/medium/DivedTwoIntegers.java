package medium;

public class DivedTwoIntegers {

	public static void main(String[] args) {
		System.out.println(divide(-2147483648, -1));
	}

	public static int divide(int dd, int di) {
		int d = 0;
		boolean s = false;
		if (dd < 0) {
			s = true;
		}
		if (di < 0) {
			s = !s;
		}
		if (dd == 0) {
			return 0;
		}
		if (di == 0)
			return Integer.MAX_VALUE;

		dd = (int) Math.abs((long)dd);
		di = (int) Math.abs((long)di);
		if (di == 1 && s) {
			return 0-dd;
		} else if (di == 1 && !s) {
			return dd;
		}
		while (dd != 0 && dd >= di) {
			dd = dd - di;
			d++;
		}
		if (s)
			return 0 - d;
		else
			return d;
	}
}
