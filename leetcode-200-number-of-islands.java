class Solution {
	public int numIslands(char[][] grid) {
        List<Integer> list = new ArrayList<>();
	    String text = "ababa";
        String pattern = "aba";
        int i = 0;
        while (i < text.length()) {
            for (int j = 0; j < pattern.length(); j++) {
                if (text.charAt(i) != pattern.charAt(j)) {
                    break;
                }
                if (j == pattern.length() - 1) {
                    list.add(i);
                }
                i++;
            }
        }
        
        for (int l : list) {
            System.out.println(l);
        }
        return 0;
        
	}		
}
    
    
/*
callBFS(grid, 0, 0):
    grid[0][0] = 0
    callBFS(grid, 1, 0):
         grid[1][0] = 0
         callBFS(grid, 2, 0): return    // bottom
         callBFS(grid, 0, 0): return    // up
         callBFS(grid, 1, -1): return   // right
         callBFS(grid, 1, 1):           // left
              grid[1][1] = 0
              callBFS(grid, 2, 1): return
              callBFS(grid, 0, 1):
                  grid[0][1] = 0
                  callBFS(grid, 1, 1): return
                  callBFS(grid, -1, 1): return
                  callBFS(grid, 0, 0): return
                  callBFS(grid, 0, 2): return
              callBFS(grid, 1, 0): return
              callBFS(grid, 1, 2): return 
callBFS(grid, -1, 0): return
callBFS(grid, 0, -1): return
callBFS(grid, 0, 1): return
                      
                      
                      
            
callBFS(grid, 2, 2):
    grid[2][2] = 0
    callBFS(grid, 3, 2): return
    callBFS(grid, 1, 2): return
    callBFS(grid, 2, 1): return
    callBFS(grid, 2, 3): return
callBFS(grid, 1, 2): return
callBFS(grid, 2, 1): return
callBFS(grid, 2, 3): return
        
callBFS(grid, 3, 3):
    grid[3][3] = 0
    callBFS(grid, 4, 3): return
    callBFS(grid, 2, 3): return
    callBFS(grid, 3, 2): return
    callBFS(grid, 3, 4):
        grid[3][4] = 0
        callBFS(grid, 4, 4): return
        callBFS(grid, 2, 4): return
        callBFS(grid, 3, 3): return
        callBFS(grid, 3, 5): return
callBFS(grid, 2, 3): return
callBFS(grid, 3, 2): return
callBFS(grid, 3, 4): return
*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
