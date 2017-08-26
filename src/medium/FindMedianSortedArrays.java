package medium;

public class FindMedianSortedArrays {

	public static void main(String[] args) {
		int[] n = { 1, 2 };
		int[] m = { };
		System.out.println(findMedianSortedArrays(n, m));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = 0;
		int j = 0;
		double m = 0;

		int t = -1;
		int temp = 0;
		int size = nums1.length + nums2.length;
		if (nums1.length == 0 && nums2.length == 0)
			return 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] > nums2[j]) {
				temp = nums2[j];
				j++;
				t++;

			} else {
				temp = nums1[i];
				i++;
				t++;
			}
			if (size % 2 == 0 && (t == size/2 - 1 || t == size/2)) {
				m = m + temp;
				if (t == size / 2) {
					m = m / 2.0;
				}
			} else if(t == size / 2) {
				m = temp;
			}
		}
		while (t<size) {
			if(i<nums1.length){
				temp = nums1[i];
				i++;
				t++;
			}
			else if(j<nums2.length){
				temp = nums2[j];
				j++;t++;
			}
			else{
				break;
			}
			if (size % 2 == 0 && (t == size / 2 - 1 || t == size / 2)) {
				m = m + temp;
				if (t == size / 2) {
					m = m / 2.0;
				}
			}
			else if(t == size / 2) {
				m = temp;
			}
		}
		return m;

	}
}
