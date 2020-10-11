学习笔记

深度优先常用递归，也可以用一个堆栈模拟递归来实现
广度优先，就是逐层遍历，通常用一个queue来保留当前层的节点
只有是有多个节点分叉的，都可以认为用深度或者广度优先来做，比如括号生成的问题

贪心算法
贪心算法是希望通过当前最优解找到全局最优解。
和动态规划或者回溯不同的是，它不会回退，并且根据当前结果做比较。
贪心算法通常适合的情况比较少，但是获得的算法会比较简单，算法复杂度低

实战题目

二分查找
二发查找前提
单点递增或者递减
存在上下界
能通过索引访问

模版
public int binarySearch(int[] array, int target) {
    int left = 0, right = array.length - 1, mid;
    while (left <= right) {
        mid = (right - left) / 2 + left;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return -1;
}