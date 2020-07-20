/*
  Contributed by: Md. A. Barik
  Video explnation: https://youtu.be/R94CJ94epiI
  CS Ninja: https://www.youtube.com/c/csninja
  TechBarik: https://www.youtube.com/channel/UCWbPk37WrNlQ2SM5Lb7pTZw
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement) ,i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
