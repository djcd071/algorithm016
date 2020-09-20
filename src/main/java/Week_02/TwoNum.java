package Week_02;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @description
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * @author:djcd
 * @date:2020/9/20
 */
public class TwoNum {

    /**
     * 暴力求解 成功击败6.24%的用户
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum_violent(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     *hash缓存
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum_(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0 ;i< nums.length; i++){
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }


}

