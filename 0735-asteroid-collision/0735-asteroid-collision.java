class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> res= new Stack<>();
        
        for(int ast:asteroids){
            if(ast>0) res.push(ast);
            else{
                while(!res.isEmpty() && res.peek()>0 && res.peek()<-ast){
                    res.pop();
                }
                if(res.isEmpty() || res.peek()<0){
                    res.push(ast);
                }
                if(res.peek()==-ast){
                    res.pop();
                }
            }
        }
        int[] ans= new int[res.size()];
        for(int i=res.size()-1; i>=0; i--){
            ans[i]= res.pop();
        }
        return ans;
    }
}