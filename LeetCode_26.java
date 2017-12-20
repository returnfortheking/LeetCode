/*
 * author:ReturnOfTheKing
 * 
 * 26. Remove Duplicates from Sorted Array
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Example:
 * Given nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 * 
 * 1.循环，sum用来统计长度，每出现一次重复sum--，每出现一次正常顺序i++；逆序和i<sum-1时直接跳出循环
 * 		超慢
 * 2.双指针，第一个i指向最左边，第二个j从i+1开始逐个查找，出现>i处数值的，交换i+1和j,i++
 * 		直到j到达末尾结束循环
 * 3.与最佳结果差距在于我的进行了交换，而实际上仅需要赋值即可完成要求。
 * 
 * 总结：关于有序或部分有序数组的问题，能用循环的，一般都能用双指针优化。
 * 
 */
package LeetCode;

public class LeetCode_26 {
    public int removeDuplicates_self2(int[] nums) {
        if(null==nums||nums.length==0)
        {
            return 0;
        }
        int i=0,j=i+1;
        while(j<nums.length)
        {
        	if(nums[i]<nums[j])
        	{
        		nums[i+1]=(nums[i+1]+nums[j])-(nums[j]=nums[i+1]);
        		i++;
        	}
        	j++;
        }
        return i+1;
    }
	public int removeDuplicates_self1(int[] nums) {
        if(null==nums||nums.length==0)
        {
            return 0;
        }
        int sum=nums.length;
        int i=0;
        while(i<sum-1)
        {
            if(nums[i]>nums[i+1])
            {
                break;
            }else if(nums[i]<nums[i+1])
            {
                i++;
                continue;
            }else{
                for(int j=i+1;j<nums.length-1;j++)
                {
                    nums[j]=(nums[j]+nums[j+1])-(nums[j+1]=nums[j]);
                }
            }
            sum--;
        }
        return sum;
    }
}
