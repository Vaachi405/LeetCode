class Solution {
    public boolean isVowel(char c){
        if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount=0;
        int n=s.length();
        int l=0;

        for(int i=0; i<n; i++){
            if(isVowel(s.charAt(i))) count++;

            if(i-l+1==k){
                maxCount = Math.max(count,maxCount);
                if(maxCount==k) return maxCount;

                if(isVowel(s.charAt(l))) count--;
                l++;
            }
        }
        
        return maxCount;
    }
}