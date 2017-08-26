package medium;

public class NumericalToRoman {

	public static void main(String[] args) {
		System.out.println(intToRoman(29));
	}

	public static String intToRoman(int num) {
		String rom = "";
		String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "II", "I" };
		int[] nums = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 2,1 };
		if (num == 0) {
			return "nulla";
		}
		while (num > 0) {
			for (int i = 0; i <= 13; i++) {
				if (num == nums[i]) {
					rom = rom + letters[i];
					return rom;
				} else if (num / nums[i] > 0) {
					rom = rom + letters[i];
					num = num - nums[i];
					break;
				}
			}
		}
		return rom;

	}
}