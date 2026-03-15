class Solution {
    public String convertToBase7(int num) {
        String s ="";
        String rev = "";
        int orig= num;
        num = Math.abs(num);
        if(num==0){
            return "0";
        }
        while(num>0){
            s+= num%7;
            num /= 7;
        }
        if(orig<num){
            s+="-";
        }
        for(int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        return rev;
    }
}