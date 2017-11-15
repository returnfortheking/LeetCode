/*
 * @author:ReturnOfTheKing
 * 
 * Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int[] A=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            h.put(target-nums[i],i);
        }
        for(int j=0;j<nums.length;j++)
        {
        	if(null!=h.get(nums[j])&&j!=h.get(nums[j]))
        	{
        		if(j>h.get(nums[j]))
        		{
        			A[0]=h.get(nums[j]);
        			A[1]=j;
                    break;
        		}else{
        			A[0]=j;
        			A[1]=h.get(nums[j]);
                    break;
        		}
        	}
        }
        return A;
        
    }
    public static void main(String[] args) {
		LeetCode_1 t=new LeetCode_1();
		int[] A={3,2,5,4};
		int tar=6;
		int[] B=new int[2];
		B=t.twoSum(A, tar);
		System.out.println(B[0]+"\b"+B[1]);
	}
}
