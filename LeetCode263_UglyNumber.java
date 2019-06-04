package LeetCode;

public class LeetCode263_UglyNumber {
    public boolean isUgly(int a) {
        if(a==0)
            return false;
        while(a%2==0)//能整除,就继续除
        {
            a = a/2;
        }
        while(a%3==0)
        {
            a = a/3;
        }
        while(a%5==0)
        {
            a = a/5;
        }
        if(a==1)//全部整除,最后为1
            return true;
        return false;//有除不尽的,最后不为1,即不是丑数
    }
}
