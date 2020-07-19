/*
  Contributed by Md. A. Barik (CS Ninja & TechBarik)
  Video Explanation: https://youtu.be/Xffre1WS0tw
*/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++) {
            res.add(1);
            
            for(int j = i - 1; j > 0; j--) {
                res.set(j, res.get(j-1) + res.get(j));
            }
        }
        return res;
        
    }
}
