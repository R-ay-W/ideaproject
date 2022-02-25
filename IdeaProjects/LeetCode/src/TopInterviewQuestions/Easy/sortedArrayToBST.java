package TopInterviewQuestions.Easy;

import java.util.Arrays;

/**
 * Definition for a binary tree node.
 */
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}


public class sortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        /**there must be a termination condition in an recursion*/
        if (nums.length == 0) {
            return null;
        }
        int[][] arr = findMiddle(nums);
        /**divide and conquer*/
        TreeNode root = new TreeNode(arr[1][0], sortedArrayToBST(arr[0]), sortedArrayToBST(arr[2]));
        return root;
    }

/**cut an array to 3 parts: the left tree, the root, and the right tree*/
    public int[][] findMiddle(int[] nums) {

        int[][] ans = new int[3][];
        int mid;
        if (nums.length % 2 == 1) {
            mid = nums.length / 2;
        } else {
            mid = nums.length / 2;
        }
        ans[1] = new int[]{nums[mid]};
        ans[0] = Arrays.copyOfRange(nums, 0, mid);
        ans[2] = Arrays.copyOfRange(nums, mid + 1, nums.length);
        return ans;
    }

    public static void main(String[] args) {
        sortedArrayToBST t1 = new sortedArrayToBST();
        int[][] a1 = t1.findMiddle(new int[]{-10, -3, 0, 5});
        for (int i = 0; i < a1.length; i++) {
            System.out.println(Arrays.toString(a1[i]));

        }
    }
}
