/*
 * @author:ReturnOfTheKing
 * 
 * 202. Happy Number
 * 
 * 1.注意用一个Map来存储信息以防无限循环。
 */
package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_202 {
    public boolean isHappy(int n) {
        int temp=0;
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        while(n!=temp)
        {
            m.put(n,1);
            temp=n;
            int sum=0,tem=0;
            while(n>0)
            {
                tem=n%10;
                sum+=Math.pow(tem,2);
                n=n/10;
            }
            n=sum;
            if(m.containsKey(sum))
            {
                break;
            }
        }
        if(n==1)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
		LeetCode_202 l=new LeetCode_202();
		if(l.isHappy(2))
			System.out.println("yes");
	}
}
