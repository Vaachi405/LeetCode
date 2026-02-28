class Solution {
    public boolean isPalindrome(String s) {
        String B= s.replaceAll("[^A-Za-z0-9]","");
        String C= B.toLowerCase();
        int j=C.length()-1;
        int i=0;
        while(i<j){
            if(C.charAt(i)==C.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}