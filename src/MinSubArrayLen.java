public class MinSubArrayLen {

    public static void main (String [] args){
        int target = 7;
        int [] nums = {2,3,1,2,4,3,7};

        int len = minSubArrayLen(target, nums);

        System.out.println(len);
    }

    private static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int total = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            total+=nums[right];
            while(total>=target){
                minLen = Math.min(minLen, right-left+1);
                total -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0: minLen;
    }
}
