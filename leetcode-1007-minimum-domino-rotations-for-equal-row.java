class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int ans = -1;        
        for (int val = 1; val <= 6; val++) {
            int currAns = helper(A, B, val);
            
            if (currAns != -1 && (ans == -1 || ans > currAns)) {
                ans = currAns;
            }
        }
        return ans;
    }
    
    private int helper(int[] A, int[] B, int val) {
        int ansTop = 0, ansBottom = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] != val && B[i] != val) {
                return -1;
            } else if (A[i] != val) {
                ansTop++;
            } else if (B[i] != val) {
                ansBottom++;
            }
        }
        
        return Math.min(ansTop, ansBottom);
    }
}

