package LeetCode;

public class LeetCode_213_HouseRobberII {
    public int rob(int[] nums) {//总体思路就是,最后有抢劫第一户的,不可能抢劫最后一户,那么含第一户的最大就是去除最后一户的前n-1户的结果,同理含最后一户必定不含第一户.
        int len=nums.length;
        int result;
        int[] nums_new=new int[len];
        nums_new=(int[])nums.clone();//建立一个相同的数组,一个用来存0到n-2,另一个用来存1到n-1的max
        //先考虑下标为0到4的情况,防止出错
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
        if(len==3)
        {
            result=nums[0]>nums[1]?nums[0]:nums[1];
            result=result>nums[2]?result:nums[2];
            return result;
        }
        if(len==4)
        {
            return Math.max(nums[0]+nums[2],nums[1]+nums[3]);
        }
        //参考HouseRobber的情况,分别进行迭代
        nums[2]=nums[2]+nums[0];
        for(int i=3;i<len-1;i++)
        {
            nums[i]=nums[i]+Math.max(nums[i-2],nums[i-3]);
        }
        nums_new[3]=nums_new[3]+nums_new[1];
        for(int i=4;i<len;i++)
        {
            nums_new[i]=nums_new[i]+Math.max(nums_new[i-2],nums_new[i-3]);
        }
        result=Math.max(nums[len-2],nums[len-3]);//最后在两个数组的最大两项共4项中找到最终结果.
        result=Math.max(result,nums_new[len-1]);
        result=Math.max(result,nums_new[len-2]);
        return result;
    }
}
