package Week_02;

import java.util.*;

public class LevelOrderNTree {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    List<List<Integer>> res = new ArrayList<>();

    /**
     * 递归
     * 空间复杂度：O(logn)
     * 时间复杂度：O(n)
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(Node root) {
        if (root==null){
            return res;
        }
        order(root,0);
        return res;
    }

    public void order(Node node,int index){
        if (res.size()<=index){
            res.add(index,new ArrayList<>());
        }
        res.get(index).add(node.val);
        if (node.children!=null){
            index++;
            for (Node n :node.children){
                order(n,index);
            }
        }
    }

    /**
     * 队列实现广度优先
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder2(Node root) {
        if (root == null){
            return res;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i< size; i++){
                Node poll = queue.poll();
                list.add(poll.val);
                queue.addAll(poll.children);
            }
            res.add(list);
        }
        return res;
    }

}
