class Solution {
    public void sortColors(int[] nums) {
        int zero =0;
        int one =0;
        int two =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) zero++;
            if(nums[i]==1) one++;
            if(nums[i]==2) two++;
        }
        
        for(int i=0; i<nums.length; i++){
            if(i<zero){
                nums[i]=0;
            }
            else {
                if(i<one+zero){
                    nums[i]=1;
                }else{
                    nums[i]=2;
                }
            }
        }
    }
}