class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> numSet= new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int n:nums){
            if(numSet.contains(n)){
                ans.add(n);
            }
            numSet.add(n);
        }
        return ans;
    }
}