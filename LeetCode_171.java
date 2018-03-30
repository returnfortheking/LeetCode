/*
 * @author:ReturnOfTheKing
 * 
 * 171. Excel Sheet Column Number
 * 
 * 1.参见168题，主要理解差出的1怎样处理。
 */
package LeetCode;

public class LeetCode_171 {
    public int titleToNumber(String s) {
        int res=0,j=1;
        for(int i=s.length()-1;i>=0;i--)
        {
            res=res+(s.charAt(i)-'A'+1)*j;
            j=j*26;
        }
        return res;
    }
}
