//Given the root of a binary tree, return the inorder traversal of its nodes' values.

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
		 Stack<TreeNode> s = new Stack<>();
		 TreeNode curr = root;
		 while(!s.isEmpty() || curr != null) {
			 if(curr != null) {
				 s.push(curr);
				 curr = curr.left;
			 }
			 else {
				 curr = s.pop();
				 list.add(curr.val);
				 curr = curr.right;
			 }
		 }
		return list; 
    }
}