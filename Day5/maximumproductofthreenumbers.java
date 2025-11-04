class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // Two possible max products:
        // 1. Product of top 3 numbers
        // 2. Product of two smallest (possibly negative) and the largest
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3],
                        nums[0] * nums[1] * nums[n - 1]);
    }
}
