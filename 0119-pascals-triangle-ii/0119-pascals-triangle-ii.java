class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[] result = new int[rowIndex+1];
        result[0]=1;
        for(int i=1; i<=rowIndex;i++){
            for(int j=i; j>=1; j--){
                result[j]= result[j] + result[j-1];
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int num:result){
            ans.add(num);
        }
        return ans;
    }
}