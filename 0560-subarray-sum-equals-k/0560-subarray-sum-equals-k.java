class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;

        HashMap<Integer, Integer> ans = new HashMap<>();
        ans.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int ques = sum - k;

            if (ans.containsKey(ques)) {
                count += ans.get(ques);
            }

            ans.put(sum, ans.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}