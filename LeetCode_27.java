/*
 * author:ReturnOfTheKing
 * 
 * 27. Remove Element
 * Given an array and a value, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 
 * Example:
 * Given nums = [3,2,2,3], val = 3,
 * Your function should return length = 2, with the first two elements of nums being 2.
 * 
 * 1.双指针从首尾向中心逼近。
 * 2.从左向右双指针，指针可以重复。
 * 
 * 心得：双指针没规定不能指向同一位置
 */
package LeetCode;

public class LeetCode_27 {
    public int removeElement_self(int[] nums, int val) {
        if(nums.length==0||null==nums)
        {
            return 0;
        }
        int i=0,j=nums.length-1;
        while(j>=i)
        {
            if(nums[j]==val)
            {
                j--;
                continue;
            }
            if(nums[i]!=val)
            {
                i++;
                continue;
            }
            nums[i]=nums[j];
            j--;
            i++;
        }
        return j+1;
    }
    int removeElement_fast(int A[], int n, int elem) {
        int begin=0;
        for(int i=0;i<n;i++) if(A[i]!=elem) A[begin++]=A[i];
        return begin;
    }

}
