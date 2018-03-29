/*
 * @author:ReturnOfTheKing
 * 
 * 167. Two Sum II - Input array is sorted
 * 
 * 1.用的通常的HashMap方法，但是处理不了两个数值相同的情况(例:[0,0] 0，此时无法区分两个0)，需要添加一个处理此情况的模块。
 */
package LeetCode;

import java.util.Map;
import java.util.HashMap;

public class LeetCode_167 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        int[] res=new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            m.put(numbers[i],i+1);
        }
        for(int j=0;j<numbers.length;j++)
        {
            if(m.containsKey(target-numbers[j]))
            {
                res[0]=m.get(numbers[j]);
                res[1]=m.get(target-numbers[j]);
            }
        }
        if(res[0]==res[1])
        {
            for(int k=0;k<numbers.length;k++)
            {
                if(numbers[res[0]-1]==numbers[k])
                {
                    res[0]=k+1;
                    break;
                }
            }
        }
        if(res[0]>res[1])
        {
            res[0]=(res[0]+res[1])-(res[1]=res[0]);
        }
        return res;
    }
}
