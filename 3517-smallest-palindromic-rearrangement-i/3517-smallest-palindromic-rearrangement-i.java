class Solution {
    public String smallestPalindrome(String s) {
        int[] Alpha = new int[26];

        int l = s.length();

        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            Alpha[ch - 'a']++;
        }

        String Answer = "";
        int index = -1;

        for (int i = 0; i < 26; i++) {
            int ele = Alpha[i] / 2;
            int rem = Alpha[i] % 2;

            if (rem == 1) {
                index = i;
            }

            char ch = (char) ('a' + i);
            Answer += String.valueOf(ch).repeat(ele);
        }

        String temp = Answer;

        if (index != -1) {
            Answer += (char) ('a' + index);
        }

        Answer = Answer + new StringBuilder(temp).reverse().toString();

        return Answer;
    }
}
