class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      int n = nums.length;
      if (n == 0 || k == 0) {
        return new int[0];
      }
      int[] result = new int[n - k + 1];
      // better naming convension deque istead windows
      Deque<Integer> deque = new ArrayDeque<>();

      for (int i = 0; i < n; ++i) {
        // remove indices that are out of bound
        while (deque.size() > 0 && deque.peekFirst() <= i - k) {
          deque.pollFirst();
        }
        // remove indices whose corresponding values are less than nums[i]
        while (deque.size() > 0 && nums[deque.peekLast()] < nums[i]) {
          deque.pollLast();
        }
        // add nums[i]
        deque.offerLast(i);
        // add to result
        if (i >= k - 1) {
          result[i - k + 1] = nums[deque.peekFirst()];
        }
      }
      return result;
    }
}

/*
#inside and out#
maxSlidingWindow([8,3,-1,-3,5,3,6,7], 3))

i = 0, curr element = 8, d = deque([]) and result = []
	 Added i to d
i = 1, curr element = 3, d = deque([0]) and result = []
	 Added i to d
i = 2, curr element = -1, d = deque([0, 1]) and result = []
	 Added i to d
	 Append nums[d[0]] = 8 to result
i = 3, curr element = -3, d = deque([0, 1, 2]) and result = [8]
	 Added i to d
	 Popped left from d because it's outside the window's leftmost (i-k)
	 Append nums[d[0]] = 3 to result
i = 4, curr element = 5, d = deque([1, 2, 3]) and result = [8, 3]
	 Popped from d because d has elements and nums[d.top] < curr element
	 Popped from d because d has elements and nums[d.top] < curr element
	 Popped from d because d has elements and nums[d.top] < curr element
	 Added i to d
	 Append nums[d[0]] = 5 to result
i = 5, curr element = 3, d = deque([4]) and result = [8, 3, 5]
	 Added i to d
	 Append nums[d[0]] = 5 to result
i = 6, curr element = 6, d = deque([4, 5]) and result = [8, 3, 5, 5]
	 Popped from d because d has elements and nums[d.top] < curr element
	 Popped from d because d has elements and nums[d.top] < curr element
	 Added i to d
	 Append nums[d[0]] = 6 to result
i = 7, curr element = 7, d = deque([6]) and result = [8, 3, 5, 5, 6]
	 Popped from d because d has elements and nums[d.top] < curr element
	 Added i to d
	 Append nums[d[0]] = 7 to result
[8, 3, 5, 5, 6, 7]
*/

