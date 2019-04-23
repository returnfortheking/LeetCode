/*
 * @author:ReturnOfTheKing
 * 
 * 45. Jump Game II
 * 	Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * 	Each element in the array represents your maximum jump length at that position.
 * 	Your goal is to reach the last index in the minimum number of jumps.
 * 	You can assume that you can always reach the last index.
 * 
 * 1.自己 写的深度优先搜索变种，分析了下其实是枚举，最后时间超过了。
 * 2.考虑应该用广度优先搜索。
 */
package LeetCode;

public class LeetCode_45_JumpGameII {
//    public int jump(int[] nums) {
//        boolean[] dfs=new boolean[nums.length];
//        int[] min_step=new int[nums.length];
//        for(int i=0;i<nums.length;i++)
//        {
//            dfs[i]=false;
//            min_step[i]=Integer.MAX_VALUE;
//        }
//        DFS(0,nums,dfs,0,min_step);
//        return min_step[nums.length-1]-1;
//    }
//    public void DFS(int v,int[] nums,boolean[] dfs,int step,int[] min_step)
//    {
//        step=step+1;
//        if(step<min_step[v]&&v==nums.length-1)
//        {
//            min_step[v]=step;
//        }
//        dfs[v]=true;
//        if(nums[v]>0)
//        {
//            for(int i=Math.min(nums.length-1,nums[v]+v);i>v;i--)
//            {
//                DFS(i,nums,dfs,step,min_step);
//            }            
//        }
//    }
    public int jump(int[] nums) {
    	boolean[] bfs=new boolean[nums.length];
        int[] min_step=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            min_step[i]=Integer.MAX_VALUE;
            bfs[i]=false;
        }
        BFS(0,nums,0,min_step,bfs);
        return min_step[nums.length-1]-1;
    }
    public void BFS(int v,int[] nums,int step,int[] min_step,boolean[] bfs)
    { 
    	if(!bfs[v]){
        if(step<min_step[v])
        {
            min_step[v]=step;
        }
        bfs[v]=true;
        
        for(int i=Math.min(nums.length-1,nums[v]+v);i>v;i--)
        {
        	if(v==nums.length-1||nums[v]==0)
        	{
        		break;
        	}
        	step=step+1;
        	BFS(i,nums,step,min_step,bfs);
        }     }          
    }
    public static void main(String[] args) {
    	LeetCode_45_JumpGameII l=new LeetCode_45_JumpGameII();
    	int[] xxs={5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5};
		System.out.println(l.jump(xxs));
	}
}
