class Solution {
    public String removeKdigits(String num, int k) {
       if(k== num.length()){
        return "0";
       }

       Stack<Character> stack = new Stack<>();
       for(char digit: num.toCharArray()){
        while(!stack.isEmpty() && k>0 && stack.peek()>digit){
            stack.pop();
            k--;
        }
        stack.push(digit);
       }

       while(k>0 && !stack.isEmpty()){
        stack.pop();
        k--;
       }

       StringBuilder sb = new StringBuilder();
       boolean leadingZero= true;

       for(char ch: stack){
        if(leadingZero && ch=='0'){
            continue;
        }
        leadingZero= false;
        sb.append(ch);
       }
       return sb.length() == 0 ? "0": sb.toString();
    }
}