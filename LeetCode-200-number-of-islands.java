/*
  Contributed by Md. A. Barik
  Video Explanation: https://youtu.be/UzB5z3UI9jM
  YouTube Channel for Software Engineering Prep: CS Ninja (https://www.youtube.com/channel/UCsQvox_DAmM8g027TnCNslA/videos)
  TechBarik: https://www.youtube.com/channel/UCWbPk37WrNlQ2SM5Lb7pTZw
*/

class Solution {
	public int numIslands(char[][] grid) {
		int count = 0;

		for (int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				if(grid[i][j] == '1') {
					count += 1;
					callBFS(grid, i, j);
				}
			}
		}
		return count;
	}
	
	public void callBFS(char[] grid, int i, int j) {
		if(i < 0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = 0;
        callBFS(grid, i+1, j); // down
        callBFS(grid, i-1, j); // up
        callBFS(grid, i, j-1); // left
        callBFS(grid, i, j+1); // right
		
}
    
    

/* Call Stack:    
callBFS(grid, 0, 0):
    grid[0][0] = 0
    callBFS(grid, 1, 0):
         grid[1][0] = 0
         callBFS(grid, 2, 0): return
         callBFS(grid, 0, 0): return
         callBFS(grid, 1, -1): return
         callBFS(grid, 1, 1):
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
    
    
    
    
    
    
    
    
    
    
    
    
    
