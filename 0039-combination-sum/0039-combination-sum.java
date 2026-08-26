class Solution {
    static void  solution(int[] candidates , int target , int index , List<List<Integer>>ans , List<Integer> result){
        // base case
        if(target == 0){
            ans.add(new ArrayList(result));
            return;
        }
        if(index >= candidates.length){
            return;
        }
        if(target<0){

            return;
        }
        result.add(candidates[index]);
       solution(candidates, target - candidates[index], index, ans, result);
        result.remove(result.size()-1);
        solution(candidates , target , index+1 , ans , result);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>  result = new ArrayList<>();
        int index = 0;
        solution(candidates , target , index , ans , result);
        return ans;
    }
}