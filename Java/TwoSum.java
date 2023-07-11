public class TwoSum {

    private int target;
    private int[] nums;

    public TwoSum(int target, int[] nums){
        this.target = target;
        this.nums = nums;
    }

    public int[] sumTwo(){
        int[] result = new int[2];
        for(int i = 0; i < this.nums.length; i++) {
            int rest = this.target - nums[i];
            for(int j = 0; j < this.nums.length && j != i; j++ ) {
                if(nums[j] == rest) {
                    result[1] = j;
                }
            }
            result[0] = i;
        }
        return result;
    }

}