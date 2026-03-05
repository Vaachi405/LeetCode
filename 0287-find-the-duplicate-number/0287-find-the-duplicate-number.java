class Solution {
    public int findDuplicate(int[] nums) {
        //approach 2 O(n) O(n)
        Set<Integer> numSet= new HashSet<>();
        for(int n:nums){
            if(numSet.contains(n)){
                return n;
            }
            numSet.add(n);
        }
        return 0;
    }
}