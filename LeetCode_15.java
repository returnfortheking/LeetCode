/*
 * @author:ReturnOfTheKing
 * 
 * 15. 3Sum
 * 
 * 1.参考2sum，将数组中每个数依次定为target，然后依次对余下的数进行2sum，将符合条件的结果写入list。timeout
 * 
 * 2.先排序，然后将每个数当成target，不过仅对比它大的数进行基于双指针的2sum，遇到重复数据跳过。
 * 
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class LeetCode_15 {
	public List<List<Integer>> threeSum(int[] numbers) {
	Arrays.sort(numbers);
	List<List<Integer>> l2=new ArrayList<List<Integer>>();
	if(numbers.length<3)
	{
	    return null;
	}
	if(numbers.length==3)
	{
	    if(numbers[0]+numbers[1]+numbers[2]!=0)
	    {
	        return null;
	    }else{
	        List<Integer> l1=new ArrayList<Integer>();
        		l1.add(0,numbers[0]);
        		l1.add(1,numbers[1]);
        		l1.add(2,numbers[2]);
        		l2.add(l1);
        		return l2;
	    }
	}
	
	for(int a=0;a<numbers.length-2;a++)
	{  			
        if(a > 0 && numbers[a] == numbers[a - 1])
        { continue;	}
		int left=a+1;
    	int right=numbers.length-1;
    	int mid=left+(right-left)/2;
    		while(left<right)
    		{
    		if(numbers[a]+numbers[left]+numbers[right]>0)
    		{
    			right--;
    		}else if(numbers[a]+numbers[left]+numbers[right]<0)
    		{
    			left++;
    		}else
    		{
        		List<Integer> l1=new ArrayList<Integer>();
        		l1.add(0,numbers[a]);
        		l1.add(1,numbers[left]);
        		l1.add(2,numbers[right]);
        		l2.add(l1);
        		left++;
        		while(left<right&&numbers[left]==numbers[left-1])
        		{
        			left++;
        		}
        		right--;
        		while (left<right&&numbers[right]==numbers[right+1]) 
        		{
        			right--;
					
				}
        		
    		}
    		}
		}

	
	return l2;

}
//    public List<List<Integer>> threeSum_self(int[] num) {
//        List<List<Integer>> l1 = new ArrayList<List<Integer>>();
//        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
//        for(int i=0;i<num.length;i++)
//        {
//            int target=0-num[i];
//            Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
//            for(int j=0;j<num.length;j++)
//            {
//                if(j==i)
//                {
//                    continue;
//                }
//                
//                m1.put(target-num[j],j);
//            }
//            for(int k=0;k<num.length;k++)
//            {
//                if(k==i)
//                {
//                    continue;
//                }
//                if(null!=m1.get(num[k])&&k!=m1.get(num[k]))
//                {
//
//                    set.add(threesorted(target-num[k],num[k],-target));
//                }
//            }
//            
//        }
//        l1.addAll(set);
//        return l1;
//        
//    }
//    public List<Integer> threesorted(int a, int b,int c)
//    {
//        List<Integer> l=new ArrayList<Integer>();
//        l.add(a);
//        l.add(b);
//        l.add(c);
//        Collections.sort(l); 
//        //return l.sort();
//        return l;
//    }
    public static void main(String[] args) {
		LeetCode_15 l=new LeetCode_15();
		int[] i={-1,0,1,2,-1,4};
		System.out.println(l.threeSum(i));
	}
}
