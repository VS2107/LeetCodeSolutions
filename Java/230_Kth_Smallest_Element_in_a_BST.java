//Given the root of a binary search tree, and an integer k, 
//return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

public class Solution {
	
	public static int kthSmallest(TreeNode root, int k) {
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		while(!stack.isEmpty() || root != null) {
			while(root != null) {
				stack.add(root);
				root = root.left;
			}
			root = stack.pop();
			list.add(root.val);
			root = root.right;
		}
		return list.get(k-1);        
    }
}