package medium;

public class ContainerWdMostWater {

	public static void main(String[] args) {
		int[] h = {1,2};
		System.out.println(maxArea(h));

	}

	public static int maxArea(int[] height) {
	    int left = 0, right = height.length - 1;
		int maxArea = 0;

		while (left < right) {
			maxArea = Math.max(maxArea, Math.min(height[left], height[right])
					* (right - left));
			if (height[left] < height[right])
				left++;
			else
				right--;
		}

		return maxArea;
	}
	
}
