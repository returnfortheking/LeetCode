/*
 * @author:ReturnOfTheKing
 * 
 * 136. Single Number
 * 
 * 1.将所有数存入HashMap当作key，出现过一次value为1，两次为2。根据value为1找到相应key值。
 * 	主要注意怎样在HashMap中根据value找相应key值。
 * 	时间复杂度O(n),空间复杂度O(n)
 * 
 * 2.对所有数依次异或，最后结果就是那个不同的数。
 */
package LeetCode;

import java.util.Map;
import java.util.HashMap;

public class LeetCode_136 {
    public int singleNumber_XOR(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            res^=nums[i];//对所有数依次进行异或运算。相同的数值异或为0，最后仅剩不同的那个数。
        }
        return res;
    }
    public int singleNumber_HashMap(int[] nums) {
        Map<Integer,Integer> m =new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int a=1;
            if(m.containsKey(nums[i]))
            {
                a=2;
            }
            m.put(nums[i],a);
        }
        int res=0;
        for(int i:m.keySet())
        {
            if(m.get(i).equals(1))
            {
                res=i;
            }
        }
        return res;
    }
}
