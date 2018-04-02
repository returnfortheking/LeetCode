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
        if(len==0||nums==null)//排除数组长度为0的情况
        {
            return 0;
        }
        if(len==1)//排除数组长度为1的情况
        {
            return nums[0];
        }
        if(len==2)//排除数组长度为2的情况
        {
            return nums[0]>nums[1]?nums[0]:nums[1];
        }
        nums[2]=nums[2]+nums[0];
        for(int i=3;i<len;i++)
        {
            if(nums[i-2]>nums[i-3])
            {
                nums[i]=nums[i]+nums[i-2];
            }else{
                nums[i]=nums[i]+nums[i-3];
            }  
        }
        return nums[len-1]>nums[len-2]?nums[len-1]:nums[len-2];
    }
    public static void main(String[] args) {
		LeetCode_198 l=new LeetCode_198();
		int[] n={1,2,100,48,4,6,9};
		System.out.println(l.rob(n));
	}
}
