package easy;

/**
 * easy:112
 * Given a binary tree and a sum,
 * determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 * give the number 22 and there is a path: 5-4-11-2 which all the nodes on the trace sums to 22
 *
 */
public class PathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return  false;
        }
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
//        if (root.left != null) {
//            if (hasPathSum(root.left, sum - root.val)) {
//                return true;
//            }
//        }
//        if (root.right != null) {
//            if (hasPathSum(root.right, sum - root.val)) {
//                return true;
//            }
//        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
