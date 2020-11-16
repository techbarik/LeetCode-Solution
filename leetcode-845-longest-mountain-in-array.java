class Solution {
    public int longestMountain(int[] A) {
        int longestMountain = 0;
        for (int i = 1; i < A.length-1; i++) {
            if (A[i-1] < A[i] && A[i+1] < A[i]) {
                int left = i-1;
                int right = i+1;
                while(left > 0 && A[left-1] < A[left]) {
                    left--;
                }
                while(right < A.length-1 && A[right+1] < A[right]) {
                    right++;
                }
                longestMountain = Math.max(longestMountain, (right - left + 1));
            }
        }
        return longestMountain;
    }
}
