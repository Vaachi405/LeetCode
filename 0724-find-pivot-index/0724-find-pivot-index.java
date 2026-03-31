class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sumleft[] = new int[n];
        int sumright[] = new int[n];

        for(int i=0; i<n-1; i++){
            sumleft[i+1]= sumleft[i]+nums[i];
        }
        for(int i=n-1; i>0; i--){
            sumright[i-1]= sumright[i]+nums[i];
        }

        for(int i=0; i<n; i++){
            if(sumleft[i]==sumright[i]) return i;
        }
        return -1;
    }

}