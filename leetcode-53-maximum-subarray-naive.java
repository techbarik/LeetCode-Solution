class Solution {
    public int maxSubArray(int[] nums) {        
        if (nums.length == 1) return nums[0];
        int max = nums[0];
        for(int i=0; i<nums.length; i++) {
            int curr = nums[i];
            for(int j=i+1; j<nums.length; j++) {
                curr += nums[j];
                max = max(max, curr, nums[j]);
            }
        }
        return max;
    }
    public int max(int a, int b, int c) {
        int mx = Math.max(a, b);
        return Math.max(mx, c);
    }
}
