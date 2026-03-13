class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int number=nums[0];
        for(int i=0; i<nums.length; i++){
            if(number== nums[i]){
                count++;
            }
            
            else if(count==0){
                number=nums[i];
                count=1;
            }
            else{
                count--;
            }
            
        }
        return number;
    }
}