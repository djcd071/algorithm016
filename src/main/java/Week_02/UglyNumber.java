package Week_02;

/**
 * @description
 * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 * 链接：https://leetcode-cn.com/problems/chou-shu-lcof
 * @author:djcd
 * @date:2020/9/20
 */
public class UglyNumber {

    /**
     * 动态规划
     * 想不到，先记住方法
     * 思路：最小值乘以2,3,5依次排列
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        int a = 0 ,b = 0, c = 0;
        int[] res = new int[n];
        res[0] = 1;
        for (int i=1;i<res.length;i++){
            int n1 = res[a] * 2;
            int n3 = res[b] * 3;
            int n5 = res[c] * 5;
            res[i] = Math.min(Math.min(n1,n3),n5);
            if (res[i]==n1){
                a++;
            }
            if (res[i]==n3){
                b++;
            }
            if (res[i]==n5){
                c++;
            }
        }
        return res[n-1];
    }

}
