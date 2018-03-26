/*
 * @author:ReturnOfTheKing
 * 
 * 100. Same Tree
 * 
 * 1.注意体会递归的思想。
 */
package LeetCode;

public class LeetCode_100 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x)
		{
			val=x;
		}
	}
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)//都为空
        {
            return true;
        }
        if((p==null&&q!=null)||(p!=null&&q==null))//其中之一为空
            {
                return false;
            }
        if(p.val!=q.val)//都不为空
        {
            return false;
        }
        if(!(isSameTree(p.left,q.left))||!(isSameTree(p.right,q.right)))//递归左节点和右节点。
        {
            return false;
        }
        return true;
    }
}
