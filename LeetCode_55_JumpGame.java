/*
 * @author:ReturnOfTheKing
 * 
 * 55. Jump Game
 * 
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that position.
 * 
 * Determine if you are able to reach the last index.
 * 
 * Example 1:
 * 	Input: [2,3,1,1,4]
 * 	Output: true
 * 	Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * 
 * 1.可以将原数组看成一个单向图，对这个图进行深度优先搜索，就能知道一个点能否到达另一个点。
 */
package LeetCode;

public class LeetCode_55_JumpGame {
    public boolean canJump(int[] nums) {
        boolean[] dfs=new boolean[nums.length];//标记数组，访问过为true，未访问为false;
        for(int i=0;i<nums.length;i++)
        {
            dfs[i]=false;
        }
        DFS(0,nums,dfs);//对起点进行深度优先搜索，若标记数组末尾为true证明可以到达。
        return dfs[nums.length-1];
    }
    public void DFS(int v,int[] nums,boolean[] dfs)//利用递归进行深度优先搜索
    {
        dfs[v]=true;//标记当前访问点
        if(nums[v]>0)//排除无效值
        {
            for(int i=v;i<=nums[v]+v&&i<nums.length;i++)//对未访问的子结点进行深度优先搜索
            {
                if(!dfs[i])
                {
                    DFS(i,nums,dfs);
                }
            }            
        }
    }
}
