class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> string = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k=0;

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k*10 + (ch - '0');
            }
            else if(ch=='['){
                count.push(k);
                string.push(current);

                k=0;
                current= new StringBuilder();
            }
            else if(ch==']'){
                StringBuilder decoded= current;
                current = string.pop();
                int repeated = count.pop();

                while(repeated > 0){
                    current.append(decoded);
                    repeated--;
                }
            }
            else{
                current.append(ch);
            }
        }
        return current.toString();
    }
}