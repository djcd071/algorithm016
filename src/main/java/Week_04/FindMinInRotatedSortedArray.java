package Week_04;

/**
 * @author djcd
 * @version V1.0
 * @ClassName：AssignCookies
 * @Description：TODO
 * @date 2020/10/12 0:10
 */
public class FindMinInRotatedSortedArray {

	public int findMin(int[] nums) {

		if (nums.length == 1) {
			return nums[0];
		}

		int left = 0;

		int right = nums.length -1;

		int lowest = nums[left] > nums[right]? right: left;

		while (right - left >1) {

			int mid = left + (right-left)/2;

			if (nums[mid] > nums[left]) {
				left = mid;
			}

			if (nums[mid] < nums[right]) {
				right = mid;
			}
		}

		lowest = nums[lowest] > nums[right]? right: lowest;

		return nums[lowest];
	}
}
