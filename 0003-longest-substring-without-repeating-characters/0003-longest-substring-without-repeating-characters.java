class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int maxLen=0;
        int l=0;
        for(int r=0 ; r<s.length(); r++){
            char c= s.charAt(r);
            if(seen.containsKey(c)){
                l= Math.max(l, seen.get(c)+1);
            }
            seen.put(c,r);
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}