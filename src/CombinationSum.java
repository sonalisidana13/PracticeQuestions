import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        backTrack(candidates, target, result, start, new ArrayList<>());
        return result;
    }

    private static void backTrack(int[] candidates, int target, List<List<Integer>> result, int start, List<Integer> current){

        //If target == 0, then return ,code will reach the next line of for loop
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        //target less than 0 will return and then in for loop it will go and remove last added item to current array
        if(target<0){
            return;
        }

        //this for loop will add the candidates[i] to the list and till the target is less than or equal to 0; it will keep on being called.
        for(int i = start;i<candidates.length;i++){
            current.add(candidates[i]);
            backTrack(candidates, target - candidates[i], result, i, current);
            current.remove(current.size()-1);
        }

    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
    }
}
