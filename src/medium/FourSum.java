package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		int[] n = {1,0,-1,-2,-1,0,-2,2};
		System.out.println(fourSum(n, -1));
		}

	public static List<List<Integer>> fourSum(int[] n, int t) {		
		Arrays.sort(n);
		List<List<Integer>> r = new ArrayList<List<Integer>>();
		int j, k, l;
		if(n==null|| n.length<4 )
			return r;
		for (int i = 0; i < n.length; i++) {
			if (i > 0 && n[i]== n[i - 1])// avoid duplicate
				continue;
			int sum = 0;
			j = i + 1;
			k = j + 1;
			l = n.length - 1;
			while (j < k && k < l) {
				
				sum = n[i] + n[j] + n[k] + n[l];
				if (sum == t) {
					r.add(Arrays.asList(n[i], n[j], n[k], n[l]));
					k++;
					l--;
					while (k > j && k < l && n[k] == n[k - 1]) {
						k++;
					}
					while (l < n.length - 2 && l > k && n[l + 1] == n[l]) {
						l--;
					}
				} else if (sum < t) {
					k++;
					while (k < l && k > j && n[k] == n[k - 1]) {
						k++;
					}
				} else {
					l--;
					while (l > k && l < n.length - 2 && n[l + 1] == n[l]) {
						l--;
					}
				}

				if (k >= l) {
					j++;
					while (j<k && n[j] == n[j-1]) {
						j++;
					}
					k = j + 1;
					l = n.length - 1;
				}
			}

		}

		return r;
	}
}
