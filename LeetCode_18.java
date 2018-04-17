/*
 * @author:ReturnOfTheKing
 * 
 * 18. 4Sum
 * 
 * 1.注意排除重复情况。
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l2=new ArrayList<List<Integer>>();
        if(nums.length<4)
        {
            return l2;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                int l=j+1,r=nums.length-1;
                while(l<r)
                {
                    int tmp=nums[i]+nums[j]+nums[l]+nums[r];
                    if(tmp>target)
                    {
                        r--;
                    }
                    else if(tmp<target)
                    {
                        l++;
                    }else if(tmp==target)
                    {
                        List<Integer> l1=new ArrayList<Integer>();
                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(nums[l]);
                        l1.add(nums[r]);
                        l++;//使循环继续
                        if(l2.contains(l1))//排除重复
                        {
                            continue;
                        }
                        l2.add(l1);
                    }
                }
            }
        }
        return l2; 
    }
}
