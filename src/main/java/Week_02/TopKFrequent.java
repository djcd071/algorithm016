package Week_02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @description
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/top-k-frequent-elements
 * @author:djcd
 * @date:2020/9/20
 */
public class TopKFrequent {

    /**
     * 思路：堆
     * 击败了97.74%的用户
     * 时间复杂度：O(Nlogk)，其中 N 为数组的长度。我们首先遍历原数组，
     * 并使用哈希表记录出现次数，每个元素需要 O(1) 的时间，共需 O(N) 的时间。
     * 随后，我们遍历「出现次数数组」，由于堆的大小至多为 k，
     * 因此每次堆操作需要 O(logk) 的时间，共需 O(Nlogk) 的时间。
     * 二者之和为 O(Nlogk)。
     * 空间复杂度:O(
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length<=0){
            return null;
        }
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.compute(nums[i],(m,v)->v==null?1:++v);
        }
        heap.addAll(map.entrySet());
        int[] res = new int[k];
        for (int i=0;i<k;i++){
            res[i] = heap.poll().getKey();
        }
        return res;
    }
}
