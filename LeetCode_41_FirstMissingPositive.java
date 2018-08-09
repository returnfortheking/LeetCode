/*
 * @author:ReturnOfTheKing
 * 
 * 	41.First Missing Positive
 * 		Given an unsorted integer array, find the smallest missing positive integer.
 * 
 * 	1.直接想法是利用一个n长数组，遍历原数组，出现几就把相应位置赋一个最小值，
 * 		遍历一遍原数组以后遍历新生成的数组，这样第几位不是最小值就证明缺失了。
 * 		时间：O(n)  	空间：O(n)
 * 	2.但是实际上在原数组直接进行上述操作就行了，不需要新建。
 */
package LeetCode;

public class LeetCode_41_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int temp=1,change=1;
        for(int i=0;i<nums.length;i++)//遍历原数组，temp为数组当前位置的值，目的是使出现过的不大于数组长度的正整数在数组中对应的值为Integer.MIN_VALUE
        {
            temp=nums[i];    
            while(temp>0&&temp<=nums.length)//符合跳转条件
            {
                if(temp!=nums[temp-1])//跳转后不在原位置，记录新位置存储的值继续跳转，新位置赋值Integer.MIN_VALUE。
                {
                	change=nums[temp-1];
                    nums[temp-1]=Integer.MIN_VALUE;
                    temp=change; 
                }else if(temp==nums[temp-1])//跳转后在原位置，赋值Integer.MIN_VALUE后结束跳转。
                {
                    nums[temp-1]=Integer.MIN_VALUE;
                    break;
                }
                
            }       
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=Integer.MIN_VALUE)//发现缺失立即跳出
            {
                temp=i+1;
                break;
            }
            temp=nums.length+1;//遍历全数组还没发现缺失值，则缺失值在数组长度外
        }
        return temp;
    }
}
