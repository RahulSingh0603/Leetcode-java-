class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if (num < 0)
                neg.add(num);
            else
                pos.add(num);
        }

        for (int i = 0; i < neg.size(); i++)
            neg.set(i, neg.get(i) * neg.get(i));

        Collections.reverse(neg);

        for (int i = 0; i < pos.size(); i++)
            pos.set(i, pos.get(i) * pos.get(i));

        int n1 = neg.size();
        int n2 = pos.size();

        int[] ans = new int[n1 + n2];

        int i = 0, j = 0, id = 0;

        while (i < n1 && j < n2) {
            if (neg.get(i) <= pos.get(j))
                ans[id++] = neg.get(i++);
            else
                ans[id++] = pos.get(j++);
        }

        while (i < n1)
            ans[id++] = neg.get(i++);

        while (j < n2)
            ans[id++] = pos.get(j++);

        return ans;
    }
}