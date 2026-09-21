class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int curMin = nums[0];
        int curMax = nums[0];
        for(int i = 1; i<nums.length; i++){
            curMax = Math.max(curMax + nums[i] , nums[i]);
            curMin = Math.min(curMin + nums[i] , nums[i]);
            max = Math.max(max , curMax);
            min = Math.min(min , curMin);
        }
        return Math.max(Math.abs(max), Math.abs(min));
    }
}