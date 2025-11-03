class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int finalans=0;
        if(nums.length==1||nums.length==2){
            finalans=-1;
        }
        else{
            for(int i=1;i<nums.length;i++){
            if (max<=nums[i]){
                max=nums[i];
            }
            if (min>=nums[i]){
                min=nums[i];
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]!=min){
                finalans=nums[i];
            }        }
    }
    return finalans;
}
}