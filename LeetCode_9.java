/*
 * author:ReturnOfTheKing
 * 
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 判断是否为回文数(例如12321)
 * 
 * 注意Math.pow输出的是double类型，需要强制转换为int才能通过。
 */
package LeetCode;

public class LeetCode_9 {
    public boolean isPalindrome(int x) {
        if(x<0)//去除负数。
        {
            return false;
        }else if(x/10==0)//小于10的数直接可判断
        {
            return true;
        }
        if(x%10==0)//删去末尾是0的非0数
        {
            return false;
        }
        int num=9;
        while(x/(int)Math.pow(10,num)==0)//求出x的位数，确切的说是位数减一
        {
            num--;
        }
        while(num>0)
        {
            if(x%10!=x/(int)Math.pow(10,num))//对比第一位和最后一位
            {
                return false;
            }
            x=x%(int)Math.pow(10,num);//删去第一位
            num-=2;
            x=x/10;//删去最后一位
        }
        return true;
    }
}
