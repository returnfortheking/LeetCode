/*
 * @author:ReturnOfTheKing
 * 
 * 104. Maximum Depth of Binary Tree
 * 
 * 1.递归调用
 * 2.深度优先搜索和广度优先搜索
 * 
 */
package LeetCode;

public class LeetCode_104 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x)
		{
			val=x;
		}
	}
    public int maxDepth1(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        return 1+Math.max(maxDepth1(root.left),maxDepth1(root.right));
    }
    
}
