/*
 * author:ReturnOfTheKing
 * 
 * 35.Search Insert Position
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Example 1:
 * Input: [1,3,5,6], 5
 * Output: 2
 * 
 * Example 2:
 * Input: [1,3,5,6], 2
 * Output: 1
 * 
 * Example 3:
 * Input: [1,3,5,6], 7
 * Output: 4
 * 
 * Example 1:
 * Input: [1,3,5,6], 0
 * Output: 0
 * 
 * 1.条件设为l<=r
 * 	 l=mid+1;r=mid-1;
 * 	这种插空的情况只需要将一般的return -1;改为return l;
 * 
 */
package LeetCode;

public class LeetCode_35 {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int mid=l+(r-l)/2;
        
        while(l<=r)
        {
        	if(nums[mid]==target)
        	{
        		return mid;
        	}
        	if(nums[mid]>target)
        	{
        		r=mid-1;
        	}
        	if(nums[mid]<target)
        	{
        		l=mid+1;
        	}
        	mid=l+(r-l)/2;
        }
        if(mid<=nums.length-1&&nums[mid]<target)
        {
        	return mid+1;
        }
    	return mid;
    }
    public static void main(String[] args) {
		LeetCode_35 l=new LeetCode_35();
    	int s[]={1,2,3};
		int a=0;
		a=l.searchInsert(s,4);
		System.out.println(a);
	}
}
