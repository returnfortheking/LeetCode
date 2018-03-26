/*
 * @author:ReturnOfTheKing
 * 
 * 101. Symmetric Tree
 * 
 * 1.递归方法
 * 		本题就是在100题的基础上稍微做了些改动。参见100题。
 */
package LeetCode;

public class LeetCode_101 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x)
		{
			val=x;
		}
	}
	    public boolean isSymmetric(TreeNode root) {
	        if(root==null)
	        {
	            return true;
	        }
	        return isSameTree(root.left,root.right);
	    }
	    public boolean isSameTree(TreeNode p, TreeNode q) {
	        if(p==null&&q==null)
	        {
	            return true;
	        }
	        if((p==null&&q!=null)||(p!=null&&q==null))
	            {
	                return false;
	            }
	        if(p.val!=q.val)
	        {
	            return false;
	        }
	        if(!(isSameTree(p.left,q.right))||!(isSameTree(p.right,q.left)))//主要注意这一条和100题相比的改动
	        {
	            return false;
	        }
	           return true;
	    }
}
