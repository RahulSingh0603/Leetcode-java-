class Solution {
    public int maxArea(int[] height) {
    int lp = 0;
    int rp = height.length-1;
    int maxWater = 0;
    while(lp<rp){
        int weidth = rp - lp;
        int minHeight = Math.min(height[lp] , height[rp]);
        int currentWater = weidth * minHeight;
        maxWater = Math.max(maxWater , currentWater);
       if (height[lp] < height[rp])
            lp++;
        else
            rp--;
    }
    return maxWater;
    }
}