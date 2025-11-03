class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int actualsum=0;
        int expectedsum=n*(n+1)/2;
        for(int i= 0 ; i<nums.length;i++){
            actualsum+=nums[i];
        }
        return expectedsum-actualsum;        
        // int n= nums.length;
        // int missval=0;
        // int[] newarray = new int[n + 1];
        // for (int i = 0; i <= n; i++) {
        //     newarray[i] = i;
        // } 
        // for (int i=0; i<newarray.length;i++){
        //     for (int j=0;j<nums.length;j++){
        //         if (newarray[i]==nums[j]){
        //             newarray[i]=-1;
        //             break;
        //         }
        //     }
        // }
        // for(int i=0; i<newarray.length;i++){
        //     if (newarray[i]!=-1){
        //         missval=newarray[i];
        //         break;
        //     }
        // }
        // return missval;
    }
}