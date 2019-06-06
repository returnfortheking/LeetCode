package LeetCode;

public class LeetCode209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {//每到一个新的点,若大于目标值,则更新当前的最短子数列
        int start;//子数列起点
        int sum;//子数列加和
        int len=Integer.MAX_VALUE;//子数列长,默认max是为了好判断,在结尾注意将max替换为0
        sum=0;
        start=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum>=s)//当子数列大于目标值时开始缩小子数列长度,看是否成立
            {
                while(sum>=s)//减少一位,看是否成立
                {
                    sum=sum-nums[start];
                    start++;
                }
                start--;//跳出循环时不成立,所以要加回来1位才满足sum>=s
                sum=sum+nums[start];
                len=Math.min(i-start+1,len);
            }
        }
        if(len==Integer.MAX_VALUE)//最后为MAX_VALUE,证明没有子数组能大于s,更新为0
            return 0;
        return len;
    }
}
