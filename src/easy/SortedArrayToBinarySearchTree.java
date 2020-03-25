package easy;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * Given the sorted array: [-10,-3,0,5,9]
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */
public class SortedArrayToBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return findMid(nums, 0, nums.length - 1);
    }

    public TreeNode findMid(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }

        int middle = (low + high) / 2;
        TreeNode middleNode = new TreeNode(nums[middle]);
        middleNode.left = findMid(nums, low, middle - 1);
        middleNode.right = findMid(nums, middle + 1, high);

        return middleNode;
    }
}
