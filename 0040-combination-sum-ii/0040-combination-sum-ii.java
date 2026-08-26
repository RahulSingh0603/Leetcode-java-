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
       solution(candidates, target - candidates[index], index+1, ans, result);
        result.remove(result.size()-1);
        while( index+1 < candidates.length && candidates[index]== candidates[index+1]){

            index++;
        }
        solution(candidates , target , index+1 , ans , result);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer>  result = new ArrayList<>();
        int index = 0;
        solution(candidates , target , index , ans , result);
        return ans;
    }
}