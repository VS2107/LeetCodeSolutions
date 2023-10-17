// https://leetcode.com/problems/flood-fill/

class Solution {
   public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		if(image[sr][sc] == color)
			return image;
		else {
			traverse(image, sr, sc, color, image[sr][sc]);
			return image;
		}  
    }

	public void traverse(int[][] image, int sr, int sc, int color, int val) {
		if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || 
            image[sr][sc] != val)
			return;
		image[sr][sc] = color;
		traverse(image, sr-1, sc, color, val);
		traverse(image, sr, sc-1, color, val);
		traverse(image, sr+1, sc, color, val);
		traverse(image, sr, sc+1, color, val);
	}
	
}