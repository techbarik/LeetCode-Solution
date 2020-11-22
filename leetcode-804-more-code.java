class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        
        Set<String> set = new HashSet<>();
        
        for (String word: words) {
            StringBuilder sb = new StringBuilder();
            
            for (char ch: word.toCharArray()) {
                sb.append(MORSE[ch - 'a']);
            }
            set.add(sb.toString());
        }
        
        return set.size();
        
    }
}
