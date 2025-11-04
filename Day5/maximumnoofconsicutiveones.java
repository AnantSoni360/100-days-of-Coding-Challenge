class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int a= 0;
     int count=0;
     for(int i=0;i<nums.length;i++){
        if (nums[i]==1){
            count=count +1;
            a=Math.max(a,count);
        }
        else{
            // if (a<=count){
            //     a=count;
            //     count=0;
            // }
            count =0;
        }
        
     }
    //  if(a<count){
    //     a=count;   
    //     }   
        return a;
    }
}