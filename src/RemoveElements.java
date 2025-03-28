public class RemoveElements {

    public int removeElement(int[] nums, int val) {
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[temp++] = nums[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int [] num = { 1,4,3,3, 5,2,5};
        RemoveElements obj = new RemoveElements();
        int k = obj.removeElement(num, 3);

        System.out.println(k);
    }
}
