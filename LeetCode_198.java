/*
 * @author:ReturnOfTheKing
 * 
 * 198. House Robber
 * 
 * 1.动态规划，n步的结果源于n-2或n-3步的结果，取其中大者加n的值存入数组，最后输出倒数两个元素中的更大者。
 */
package LeetCode;

public class LeetCode_198 {
    public int rob(int[] nums) {
        //可用动态规划解决
        int len=nums.length;
        if(len==0||nums==null)
        {
            return 0;
        }
        if(len==1)
        {
            return nums[0];
        }
        if(len==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        nums[2]=nums[2]+nums[0];
        for(int i=3;i<len;i++)
        {
            nums[i]=nums[i]+Math.max(nums[i-2],nums[i-3]);
        }
        return Math.max(nums[len-1],nums[len-2]);
    }
    public int rob_simple(int[] num) {
        int prevNo = 0;
        int prevYes = 0;
        for (int n : num) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = n + temp;
        }
        return Math.max(prevNo, prevYes);
    }
    public static void main(String[] args) {
		LeetCode_198 l=new LeetCode_198();
		int[] n={1,2,100,48,4,6,9};
		System.out.println(l.rob(n));
	}
}
