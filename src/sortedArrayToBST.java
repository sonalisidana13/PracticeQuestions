public class sortedArrayToBST {

    public static TreeNode sortedArrayToBST(int[] nums) {
        //Initialise left and right pointer for tree node
        return helper(nums, 0, nums.length-1);
    }

    private static TreeNode helper(int[] nums, int left, int right){
        if(left > right){
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, left, mid-1);
        root.right = helper(nums, mid + 1, right);

        return root;
    }

    public static void main (String [] args){

        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode sortedTree = sortedArrayToBST(nums);
        printLevelOrder(sortedTree);
    }

    static void printLevelOrder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        printLevelOrder(root.left);
        printLevelOrder(root.right);
    }

}
