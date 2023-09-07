/*
 Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 */
public class Solution {
	
	public static List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		List<List<Integer>> result = new ArrayList<>();
		TreeNode temp = null;
		if(root == null)
			return result;
		
		q.add(root);
		while(!q.isEmpty()) {
			int levelSize = q.size();
			List<Integer> list = new ArrayList<>();
			for(int i=0; i<levelSize; i++) {
				temp = q.poll();
				list.add(temp.val);
				
				if(temp.left != null)
					q.add(temp.left);
				if(temp.right != null)
					q.add(temp.right);
			}
			result.add(list);
		}
		return result;
	}
}
