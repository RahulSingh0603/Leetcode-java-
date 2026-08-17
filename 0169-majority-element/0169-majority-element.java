class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int n = nums[0];
        for(int i: nums){
            if(i == n){
                count++;
            }
            else{
                count--;
                if(count == 0){
                    n = i;
                    count++;
                }
            }
        }
        return n;
    }
}