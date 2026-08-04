class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n  = nums.length;
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i<n; i++){
            if(nums[i]>max){
                max = nums[i];
            }
          if(nums[i]<min){
                min = nums[i];
            }
        }
        List<Integer> ans = new ArrayList<>();

        for(int i = min ; i<=max ; i++){
            boolean flag = false ;
            for(int j = 0; j<n;j++){
                

                if(i==nums[j]){
                    flag = true ;
                    break ;
                }
            }
             if(flag==false){
                    ans.add(i);
                }
        }
        return ans ;
    }
}