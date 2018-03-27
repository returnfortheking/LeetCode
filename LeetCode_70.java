/*
 * @author:ReturnOfTheKing
 * 
 * 70. Climbing Stairs
 * 
 * 1.普通递归，time out，2^N的时间复杂度，太可怕了。
 * 2.将每一步计算结果存入数组。空间换时间。
 */
package LeetCode;

public class LeetCode_70 {
    public int climbStairs(int n) {
        if(n<3)//n=1时为1，n=2时为2.
        {
            return n;
        }
        int[] c=new int[n];//用一个n长度数组记录结果。
        c[0]=1;
        c[1]=2;
        for(int i=2;i<n;i++)//递推计算。
        {
            c[i]=c[i-1]+c[i-2];
        }
        return c[n-1];
    }
    public int climbStairs_timeout(int n) {
        if(n<3)
        {
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
