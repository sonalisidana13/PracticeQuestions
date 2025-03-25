import java.util.HashSet;

public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        HashSet<Integer> resultSet = new HashSet<>();
        int count = 0;

        for(int i=0;i<nums.length;i++){
            if(!resultSet.contains(nums[i])){
                resultSet.add(nums[i]);
                nums[count++] = nums[i];
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4};

        RemoveDuplicatesSortedArray obj = new RemoveDuplicatesSortedArray();
        int result = obj.removeDuplicates(nums);

        // Print the modified array
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
