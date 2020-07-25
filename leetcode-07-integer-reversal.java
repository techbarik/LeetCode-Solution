/*
  Contributed by: Md. A. Barik
  Video Explanation: https://youtu.be/ZZAF6xHXAt8
*/

class Solution {
    public int reverse(int x) {
        long reversed = 0;
        while(x != 0) {
            int reminder = x % 10;
            reversed = reversed * 10 + reminder;
            x = x / 10;
        }
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) return 0;
        return (int) reversed;
    }
}
