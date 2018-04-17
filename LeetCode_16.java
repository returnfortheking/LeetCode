/*
 * @author:ReturnOfTheKing
 * 
 * 16. 3Sum Closest
 * 
 * 1.类似3Sum，甚至更简单些
 */
package LeetCode;

import java.util.Arrays;

public class LeetCode_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        int res=nums[0]+nums[1]+nums[2];
        int tmp=0;
        for(int i=0;i<=nums.length-3;i++)
        {
            l=i+1;r=nums.length-1;
            while(l<r)
            {
                tmp=nums[i]+nums[l]+nums[r];
                if(tmp>target)
                {
                    r--;
                }
                else if(tmp<target)
                {
                    l++;
                }else if(tmp==target)
                {
                    return target;
                }
                res=maxres(target,tmp,res);
            }
            
        }
        return res;
    }
    public int maxres(int t,int a,int b){
        int a1=Math.abs(t-a);
        int b1=Math.abs(t-b);
        return Math.min(a1,b1)==a1?a:b;
    }
    public static void main(String[] args) {
		LeetCode_16 l=new LeetCode_16(); 
    	int[] n={-1,1,2,-4};
		int t=1;
		
		System.out.println(l.threeSumClosest(n, t));
	}
}
