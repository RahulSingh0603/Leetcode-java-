class Solution {
    private void swap(int[] nums,int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i] == i+1 || nums[i] == nums[nums[i]-1] ){

                i++;
            }
            else {
                swap(nums , i , nums[i] - 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
            for(i = 0 ; i<nums.length ; i++){
                if(nums[i] != i+1){
                ans.add(i+1);
                }
            }
        return ans;
    }
}