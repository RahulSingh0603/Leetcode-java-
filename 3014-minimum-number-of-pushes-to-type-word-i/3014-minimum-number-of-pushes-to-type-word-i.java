class Solution {
    public int minimumPushes(String word) {
        int n =word.length();
        int minpush = 0;
    for(int words = 0; words<n ; words++){
        minpush = minpush + (words / 8+1);
    }
    return minpush;
    }
}