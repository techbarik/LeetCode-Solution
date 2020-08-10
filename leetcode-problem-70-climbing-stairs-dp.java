/*
  Video Explanation: https://youtu.be/RXsKyW6uzmE
*/
public class Solution {
    public int climbStairs(int n) {
        int T[] = new int[n + 1];
        return climb_Stairs(0, n, T);
    }
    public int climb_Stairs(int i, int n, int T[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (T[i] > 0) {
            return T[i];
        }
        T[i] = climb_Stairs(i + 1, n, T) + climb_Stairs(i + 2, n, T);
        return T[i];
    }
}
