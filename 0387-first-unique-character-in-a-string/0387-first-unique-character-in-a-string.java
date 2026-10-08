class Solution {
    public int firstUniqChar(String s) {
        Map<Character , Integer> d = new HashMap<>();
        for(int i  = 0; i<s.length(); i++){
            char c = s.charAt(i);
            d.put(c,d.getOrDefault(c,0)+1);
        }
        for(int i=0 ; i<s.length(); i++){
            char c = s.charAt(i);
            if(d.get(c)==1) return i;
        }
        return -1;
    }
}