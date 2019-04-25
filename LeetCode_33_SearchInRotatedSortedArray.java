/*
 * @author:ReturnOfTheKing
 * 
 * 
 * 1.按照落点分左右两种情况,每种情况按照mid与target关系又各有两种情况,然后依据target和左右边界大小又有两种情况
 * 		共8种情况,需要归纳总结,注意与边界相等的情况.
 */
package LeetCode;

public class LeetCode_33_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0)
        {
            return -1;
        }
        int left,right,mid;
        left=0;right=nums.length-1;
        while(left<=right){
            mid=(right+left)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                if(target<nums[left]&&nums[mid]>=nums[left])
                {
                    left=mid+1;
                }else
                    right=mid-1;
            }
            else if(nums[mid]<target)
            {
                if(target>nums[right]&&nums[mid]<=nums[left])
                {
                    right=mid-1;
                }else
                    left=mid+1;
            }
        }
        return -1;
    }
}
