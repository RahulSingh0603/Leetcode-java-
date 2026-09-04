class Solution {
    public int trap(int[] height) {
        int lp = 0;
        int rp = height.length - 1;
        int lMax = 0;
        int rMax = 0;
        int ans = 0;
        while(lp < rp){
            lMax = Math.max(lMax , height[lp]);
            rMax = Math.max(rMax , height[rp]);
            if(lMax < rMax){
                ans += lMax - height[lp];
                lp++;
            }
            else{
                ans += rMax - height[rp];
                rp--;
            }
        }
        return ans;
    }
}