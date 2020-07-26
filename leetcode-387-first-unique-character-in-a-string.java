/*
  Contributed by: Md. A. Barik
  Video Explanation: https://youtu.be/oq3iJoqsESw
*/

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (count.containsKey(c)) {
                Integer newVal = count.get(c) + 1;
                count.put(c, newVal);
            } else {
                count.put(c, 1);
            }
        }
        for (char c : s.toCharArray()) {
            if (count.get(c) == 1) return s.indexOf(c); // Getting index of c
        }
        return -1;
    }
}
