class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        for(int k = 0; k<nums.length; k++){
            int leftSum = 0;
            int rightSum = 0;
            for(int i = 0 ; i<k; i++){
            leftSum += nums[i]; 
            }
            for(int j = k+1; j<nums.length; j++){
            rightSum += nums[j];
            }
            ans[k] = Math.abs(leftSum - rightSum);
        }
        return ans;
    }
}