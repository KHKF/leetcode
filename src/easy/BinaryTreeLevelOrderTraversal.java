package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
input:
    3
   / \
  9  20
    /  \
   15   7
 output:
 [
  [15,7],
  [9,20],
  [3]
]
 */
public class BinaryTreeLevelOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Deque<List<Integer>> deque = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            List<Integer> subList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode parent = queue.poll();
                if (parent.left != null) {
                    queue.add(parent.left);
                }
                if (parent.right != null) {
                    queue.add(parent.right);
                }
                subList.add(parent.val);
            }
            if (!subList.isEmpty()) {
                deque.addFirst(subList);
            }
        }
        return new ArrayList<>(deque);
    }
}
