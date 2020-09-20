package Week_02;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class InOrderTraversal {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }

    ArrayList<Integer> res = new ArrayList<Integer>();


    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null){
            return res;
        }
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return res;
    }


    /**
     * 迭代方法
     * 思路，用栈模拟递归
     * 时间复杂度：
     * 空间复杂度：
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        if (root==null){
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while (root!=null&&!stack.isEmpty()){
            while (root!=null){
                stack.push(root.left);
                root = root.left;
            }
            TreeNode node = stack.pop();
            res.add(node.val);
            root = root.right;
        }
        return res;
    }


//    public List<Integer> inorderTraversal_2(TreeNode root) {
//        Deque<Integer> res = new LinkedList<>();
//        Deque<TreeNode> stack = new LinkedList<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            TreeNode pop = stack.pop();
//            res.add(pop.val);
//            if (pop.left!=null){
//                stack.addLast(root.left);
//            }
//            stack.addLast(pop);
//            if (pop.right!=null){
//                stack.addLast(root.right);
//            }
//        }
//        return (List<Integer>) res;
//    }
}
