class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr = max;
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(curr + nums[i], nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
}
