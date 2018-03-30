/*
 * @author:ReturnOfTheKing
 * 
 * 169. Majority Element
 * 
 * 1.HashMap，略。
 * 
 * 2.说是贪心算法，但是并没有理解思想。个人理解还是遍历然后记录下当前最好的情况，但是自己写的时候没有想出怎样处理数据分散的情况。
 */
package LeetCode;

public class LeetCode_169 {
    public int majorityElement(int[] nums) {
    	int res=0;
    	int count=0;
    	for(int i=0;i<nums.length;i++)
    	{
    		if(count==0)
    		{
    			res=nums[i];
    			count++;
    		}else if(nums[i]!=res)
    		{
    			count--;
    		}else{
    			count++;
    		}
    	}
    	return res;
    }
}
