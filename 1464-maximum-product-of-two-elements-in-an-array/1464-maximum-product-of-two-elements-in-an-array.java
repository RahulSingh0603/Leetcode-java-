class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int num1 = nums[n] -1;
        int num2 = nums[n-1]-1;
        return num1 *num2;
    }
}