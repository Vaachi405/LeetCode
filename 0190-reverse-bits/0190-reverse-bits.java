class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        int l = s.length();
        for(int i = l-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        for(int j = 0; j<32-l; j++){
            sb.append('0');
        }
        return Integer.parseInt(sb.toString(),2);

    }
}