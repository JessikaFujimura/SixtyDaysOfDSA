import java.util.HashMap;

public class TwoSum {

    private int target;
    private int[] nums;

    public TwoSum(int target, int[] nums){
        this.target = target;
        this.nums = nums;
    }

    public int[] sumTwo(){
        HashMap<Integer, Integer> result = new HashMap<>();
        for(int i = 0; i < this.nums.length; i++) {
            int rest = this.target - nums[i];
            if(result.containsKey(rest)){
                return new int[] {result.get(rest), i};
            }
            result.put(nums[i], i);
        }
        return new int[0];
    }

}