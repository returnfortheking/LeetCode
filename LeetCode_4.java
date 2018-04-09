/*
 * @author:ReturnOfTheKing
 * 
 * 4. Median of Two Sorted Arrays
 * 
 * 1.先将两个数组合并成一个有序数组，再直接取中位数。
 * 	时间复杂度:m+n
 * 	空间复杂度:m+n
 */
package LeetCode;

public class LeetCode_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0)
        {
            return findmed(nums2);
        }
        if(nums2.length==0)
        {
            return findmed(nums1);
        }
        int num[]=new int[nums1.length+nums2.length];
        int i=0,j=0;
        for(int k=0;k<num.length;k++)
        {
            if(i<nums1.length&&j<nums2.length)
            {
                if(nums1[i]<nums2[j])
                {
                    num[k]=nums1[i];
                    i++;
                }else{
                    num[k]=nums2[j];
                    j++;
                }
            }else if(i<nums1.length){
                num[k]=nums1[i];
                i++;
            }else if(j<nums2.length){
                num[k]=nums2[j];
                j++;
            }
            
        }
        return findmed(num);
    }
    public double findmed(int[] nums)
    {
        if(nums.length==0||nums==null)
        {
            return 0;
        }else if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length%2!=0)
        {
            return nums[nums.length/2];         
        }
        if(nums.length%2==0)
        {
            double a=nums[nums.length/2];
            double b=nums[nums.length/2-1];
            return (a+b)/2;
        }
        return 0;
    }
}
