class Solution {
    public String removeStars(String s) {
        char c[]  = s.toCharArray();
        int top=0;

        for(int i=0; i<s.length(); i++){
            if(c[i]=='*'){
                top--;
            }
            else{
                c[top]=c[i];
                top++;
            }
        }
        return new String(c,0,top);
    }
}
