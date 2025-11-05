class Solution {
    public void sortColors(int[] nums) {
            int n=nums.length;
            int low =0;
            int mid=0;
            int high=n-1;
            while(mid<=high){
                if(nums[mid]==0){
                    swap(nums,mid,low);
                    mid++;
                    low++;
                }
                else if(nums[mid]==1){
                    mid++;
                }
                else{
                    swap(nums,mid,high);
                    high--;
                }
            }
            }
            public void swap(int[]nums,int a,int b){
                int temp =nums[b];
                nums[b]=nums[a];
                nums[a]=temp;
            }
            // int n =nums.length;
            // int count0=0;
            // int count1=0;
            // int count2=0;
            // for (int  i=0;i<nums.length;i++){
            //     if(nums[i]==0){
            //         count0++;
            //     }
            //     else if( nums[i]==1){
            //         count1++;
            //     }
            //     else{
            //         count2++;
            //     }
            // }
            // int index=0;
            // for(int i =0;i<count0;i++){
            //     nums[index++]=0;
            // }
            // for(int i=0;i<count1;i++){
            //     nums[index++]=1;
            // }
            // for(int i=0;i<count2;i++){
            //     nums[index++]=2;
            // }

}