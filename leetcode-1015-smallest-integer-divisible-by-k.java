class Solution {
    public int smallestRepunit`DivByK(int K) {
        if (K <= 0) return -1;     // invalid iniput
        if (K % 2 == 0) return -1; // even number multiples never ends with 1
        if (K % 5 == 0) return -1; // multiples of 5 never ends with 1
        int remainder = 0;
        for (int length_N = 1; length_N <= K; length_N++) {
            remainder = (remainder * 10 + 1) % K;
            if (remainder == 0) {
                return length_N;
            }
        }
        return -1;
    }
}
