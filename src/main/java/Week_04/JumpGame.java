package Week_04;

/**
 * @author djcd
 * @version V1.0
 * @ClassName：AssignCookies
 * @Description：TODO
 * @date 2020/10/12 0:10
 */
public class JumpGame {

	public boolean canJump(int[] nums) {

		int reach = 0;

		for (int i=0; i<nums.length; i++) {

			if (i > reach) {
				return false;
			}

			reach = Math.max(nums[i]+ i, reach);

		}
		return reach >= nums.length -1 ;

	}
}
