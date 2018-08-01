/*
 * 88. Merge Sorted Array
 * 
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * 	You may assume that nums1 has enough space (size that is greater or equal to m + n) 
 * to hold additional elements from nums2.
 * 
 * 1.从nums1尾部开始吧
 */
package LeetCode;

public class LeetCode_88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m-1,s=n-1;
        while(!(l<0&&s<0))
        {
            if(s==-1)
            {
                nums1[l+s+1]=nums1[l];
                l--;
                continue;
            }else if(l==-1)
            {
                nums1[l+s+1]=nums2[s];
                s--;
                continue;
            }
            if(nums1[l]>nums2[s])
            {
                nums1[l+s+1]=nums1[l];
                l--;
                continue;
            }else if(nums1[l]<=nums2[s])
            {
                nums1[l+s+1]=nums2[s];
                s--;
                continue;
            } 
        }
    }
}
