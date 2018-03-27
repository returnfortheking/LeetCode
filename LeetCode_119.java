/*
 * @author:ReturnOfTheKing
 * 
 * 119. Pascal's Triangle II
 * 要求只用O(k)额外空间。
 * 
 * 1.参见118，稍作修改即可。
 * 2.不重新建立新的List，而是在原有基础上直接修改值。
 */
package LeetCode;

import java.util.List;
import java.util.ArrayList;

public class LeetCode_119 {
	public List<Integer> getRow(int rowIndex) {
	    List<Integer> res = new ArrayList<Integer>();
	    for(int i = 0;i<rowIndex+1;i++) {
	    		res.add(1);
	    		for(int j=i-1;j>0;j--) {
	    			res.set(j, res.get(j-1)+res.get(j));
	    		}
	    }
	    return res;
	}
    public List<Integer> getRow_self(int rowIndex) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        if(rowIndex==0)
        {
            return l;
        }
        l.add(1);
        if(rowIndex==1)
        {
            return l;            
        }
        for(int i=1;i<rowIndex;i++)
        {
            List<Integer> res = new ArrayList<Integer>();
            res.add(1);
            for(int j=1;j<i+1;j++)
            {
                res.add(l.get(j)+l.get(j-1));
            }
            res.add(1);
            l=res;
        }
        return l;
    }
}
