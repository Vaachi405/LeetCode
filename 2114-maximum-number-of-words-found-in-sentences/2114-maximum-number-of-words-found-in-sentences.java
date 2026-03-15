class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLen =0;
        for(String curr : sentences){
            int curlen = curr.split(" ").length;
            if(maxLen < curlen){
                maxLen= curlen;
            }
        }
        return maxLen;
    }
}