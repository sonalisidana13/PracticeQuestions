public class NumArray {

        private int [] prefixSum;

        public NumArray(int[] nums) {
            prefixSum = new int[nums.length+1];
            for(int i = 0; i< nums.length;i++){
                prefixSum[i+1] = prefixSum[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            //This stores the sum from left to right range
            //nums = [-2, 0, 3, -5, 2, -1]
            //prefix = [0, -2, -2, 1, -4, -2, -3]
            //prefix[1] = -2 (sum of first element)
            //prefix[3] = 1 (sum of nums[0] to nums[2])
            return prefixSum[right+1] - prefixSum[left];
        }

    public static void main(String [] args){
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);

        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));  // Output: -1
        System.out.println(numArray.sumRange(0, 5));
    }
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
}
