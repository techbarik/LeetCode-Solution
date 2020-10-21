
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if (asteroids.length <= 1) return asteroids;  // Handling egde cases
        
        Stack<Integer> stack = new Stack<>();
        for (int asteriod : asteroids) {
            // add to stack all positive asteroids
            if (asteriod > 0) { 
                stack.push(asteriod);
            } else {
                // Remove all positive asteroids before our current asteroid
                while (!stack.isEmpty() && stack.peek() > 0 && Math.abs(stack.peek()) < Math.abs(asteriod))  
                    stack.pop();
                // Checking if the stack is empty or the recent asteriod is negative!
                if (stack.isEmpty() || stack.peek() < 0) 
                    stack.push(asteriod);
                // If recent asteriod <= our asteriod, We broke our outer loop if equal we pop it.
                else if (stack.peek() == Math.abs(asteriod)) 
                    stack.pop();
            }
        }
        
        int[] arr = new int[stack.size()];
        for (int i = arr.length - 1; i >= 0; i--)
            arr[i] = stack.pop();
        
        return arr;
    }
}
