class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int high = 0;
        int low = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int n = nums.length;
        while(high<n){
            sum += nums[high];
            while(sum >= target){
                minLen = Math.min(minLen , high - low +1);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}