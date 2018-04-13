/*
 * @author:ReturnOfTheKing
 * 
 * 15. 3Sum
 * 
 * 1.参考2sum，将数组中每个数依次定为target，然后依次对余下的数进行2sum，将符合条件的结果写入list。timeout
 * 
 * 2.
 * 
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class LeetCode_15 {
    public List<List<Integer>> threeSum_self(int[] num) {
        List<List<Integer>> l1 = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
        for(int i=0;i<num.length;i++)
        {
            int target=0-num[i];
            Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
            for(int j=0;j<num.length;j++)
            {
                if(j==i)
                {
                    continue;
                }
                
                m1.put(target-num[j],j);
            }
            for(int k=0;k<num.length;k++)
            {
                if(k==i)
                {
                    continue;
                }
                if(null!=m1.get(num[k])&&k!=m1.get(num[k]))
                {

                    set.add(threesorted(target-num[k],num[k],-target));
                }
            }
            
        }
        l1.addAll(set);
        return l1;
        
    }
    public List<Integer> threesorted(int a, int b,int c)
    {
        List<Integer> l=new ArrayList<Integer>();
        l.add(a);
        l.add(b);
        l.add(c);
        Collections.sort(l); 
        //return l.sort();
        return l;
    }
    public static void main(String[] args) {
		LeetCode_15 l=new LeetCode_15();
		int[] i={-1,0,1,2,-1,4};
		System.out.println(l.threeSum_self(i));
	}
}
