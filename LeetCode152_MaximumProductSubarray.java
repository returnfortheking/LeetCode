package LeetCode;

public class LeetCode152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {//当前最小值,当前最大值,维护这两个dp表,全局最大值用来处理出现0的情况,题设没0可省略
        if(nums.length==1)
        {
            return nums[0];
        }
        int max=nums[0];//记录全局最大值(当出现0时,dp_min和dp_max会刷新成0)
        int[] dp_min=new int[nums.length];//记录当前最小值(绝对值最大的负数)
        int[] dp_max=new int[nums.length];//记录当前最大值
        dp_min[0]=dp_max[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            dp_min[i]=Math.min(Math.min(dp_max[i-1]*nums[i],dp_min[i-1]*nums[i]),nums[i]);
            
            dp_max[i]=Math.max(Math.max(dp_max[i-1]*nums[i],dp_min[i-1]*nums[i]),nums[i]);
            
            max=Math.max(max,dp_max[i]);
        }
        return max; 
    }
}
