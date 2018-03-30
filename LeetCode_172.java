/*
 * @author:ReturnOfTheKing
 * 
 * 172. Factorial Trailing Zeroes
 * 
 * 1.直观看是取决于2和5，但分析过后发现只取决于5和5的倍数的那些数，因为2的个数远远比5多，不需统计
 */
package LeetCode;

public class LeetCode_172 {
    public int trailingZeroes(int n) {
        int z=0;
        while(n>=5)
        {
            n=n/5;
            z+=n;
        }
        return z;
    }
}
