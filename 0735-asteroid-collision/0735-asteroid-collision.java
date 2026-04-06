class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> res= new Stack<>();
        
        for(int ast:asteroids){
            if(ast>0) res.push(ast);
            else{
                //for asteroids that explode more than 1 asteroid
                while(!res.isEmpty() && res.peek()>0 && res.peek()<-ast){
                    res.pop();
                }
                //if stack element is negative
                if(res.isEmpty() || res.peek()<0){
                    res.push(ast);
                }
                //for asteroid that have equal value
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