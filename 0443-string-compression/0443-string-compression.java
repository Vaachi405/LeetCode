class Solution {
    public int compress(char[] chars) {
        int index= 0;
        int i=0;
        while(i<chars.length){
            int j=i;
            while(j<chars.length && chars[j] == chars[i]){
                j++;
            }
            chars[index]=chars[i];
            index++;

            int count= j-i;
            if(count>1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[index]=c;
                    index++;
                }
            }
            i=j;
        }
        return index;
    }
}