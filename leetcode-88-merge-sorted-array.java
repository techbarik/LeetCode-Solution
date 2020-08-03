/*
  Contributed by: Md. A. Barik
  Video Explanation: https://youtu.be/UmRMNttzeTw
*/

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m --;
        n --;
        for (int i = m + n + 1; i >=0; i --) {
            int a = m >=0 ? nums1[m]:Integer.MIN_VALUE;
            int b = n >=0 ? nums2[n]:Integer.MIN_VALUE;
            if (a > b) {
                nums1[i] = a;
                m --;
            }
            else {
                nums1[i] = b;
                n --;
            }
        }
    }
}
