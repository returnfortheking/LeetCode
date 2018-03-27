/*
 * @author:ReturnOfTheKing
 * 
 * 118. Pascal's Triangle
 * 
 * 1.递推求值，参见70题的过程。注意l2每添加一个ArrayList时要新建一个，不能用原来的。
 */

package LeetCode;

import java.util.List;
import java.util.ArrayList;

public class LeetCode_118 {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> l1=new ArrayList<Integer>();
        List<List<Integer>> l2=new ArrayList<List<Integer>>();
	    if(numRows==0)//0时返回空
	    {
	        return l2;
	    }
	    l1.add(1);
	    l2.add(l1);
	    if(numRows==1)//1时返回[1]
	    {
	
	        return l2;
	    }
	    List<Integer> t=new ArrayList<Integer>();
	    t.add(1);
	    t.add(1);
	    l2.add(t);
	    if(numRows==2)//2时返回[1],[1,1]
	    {
	        return l2;
	    }
	    for(int i=2;i<numRows;i++)//开始循环求解
	    {
	        List<Integer> l=new ArrayList<Integer>();
	        l=l2.get(i-1);
	        List<Integer> temp=new ArrayList<Integer>();
	        temp.add(1);
	        for(int j=1;j<l.size();j++)
	        {
	            temp.add(l.get(j)+l.get(j-1));
	        }
	        temp.add(1);
	        l2.add(temp);
	    }
	    return l2;
	}
}
