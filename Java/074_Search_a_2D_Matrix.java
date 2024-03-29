/*You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 */
public class Solution {
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		
		if(m==1 && n==1) {
			if(matrix[0][0] == target)
				return true;
			else
				return false;
		}
		for(int i=0; i<m; i++) {
			if(target >= matrix[i][0] && target <= matrix[i][n-1]) {
				for(int j=0; j<n; j++) {
					if(target == matrix[i][j])
						return true;
				}
			}
		}
		return false;
    }
}
