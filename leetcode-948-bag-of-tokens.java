class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        if (tokens.length == 0 || tokens[0] > P) return 0;
        int score = 0;
        int left = 0;
        int right = tokens.length - 1;
        
        while (left <= right) {
            if (P >= tokens[left]) {
                score++;
                P = P - tokens[left];
                left++;
            } else {
                if (right - left > 0) {
                    score--;
                    P = P + tokens[right];
                    right--;
                } else break;
            }
        }
        
        return score;
        
    }
}
