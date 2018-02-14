/*
 * author:ReturnOfTheKing
 * 
 * 53. Maximum Subarray
 * 
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * 
 * 1.遍历累加，更新最大值，子数组和小于0时重置子数组的开头。
 * 2.DP(尚不了解)
 */
package LeetCode;

public class LeetCode_53 {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],temp=0;
        for(int i=0;i<nums.length;i++)//注意1和2的顺序不能反，否则会过滤掉小于0的数。
        {
            temp+=nums[i];
            //1.更新sum值
            if(sum<temp)
            {
                sum=temp;
            }
            //2.检查子数组是否小于0，重置
            if(temp<0)
            {
                temp=0;
            }
        }
        return sum;
    }
    public int maxSubArrayDP(int[] A) {
        int n = A.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = A[0];
        int max = dp[0];
        
        for(int i = 1; i < n; i++){
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        
        return max;
}
}
