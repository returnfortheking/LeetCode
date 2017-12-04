/*
 * author:ReturnOfTheKing
 * 
 * 7. Reverse Integer
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Example 1:
  	Input: 123
	Output:  321
	Example 2:
	
	Input: -123
	Output: -321
	Example 3:
	
	Input: 120
	Output: 21
 * Note:
	Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. 
	For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 * 
 * 1.注意负数情况，注意超出范围情况。
 * 		int最大最小值的表示
 * 
 * 
 */
package LeetCode;

public class LeetCode_7 {
    public int reverse(int x) {
        long temp=0;
        long zf=1;
        if(x<0&&x!=Integer.MIN_VALUE)//取绝对值
        {
            zf=-1;
            x=-x;
        }else if(x==Integer.MIN_VALUE)//Integer.MIN_VALUE绝对值超出范围，舍弃
        {
            return 0;
        }
        while(x>0)
        {
            if(x%10==0)//除去数尾部多余的零
            {
                x=x/10;
                continue;
            }
            break;
        }
        while(x>0)
        {
            temp=(temp*10+x%10)<Integer.MAX_VALUE?(temp*10+x%10):0;//迭代，一旦超过int范围则输出0；
            if(temp==0)
            {
                return 0;
            }
            x=x/10;
        }
        return (int)zf*(int)temp; //返回时强制转换为int
    }
}
