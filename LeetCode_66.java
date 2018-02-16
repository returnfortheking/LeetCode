/*
 * @author:ReturnOfTheKing
 * 
 * Plus One
 * 
 * 1.主要注意进位的问题。
 */
package LeetCode;

public class LeetCode_66 {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        digits[i]+=1;
        while(digits[i]==10&&i>=0)
        {
            if(i==0)
            {
                digits[i]=0;
                int[] n=new int[digits.length+1];
                for(int j=0;j<digits.length;j++)
                {
                    n[j+1]=digits[j];
                }
                n[0]=1;
                return n;
            }
            digits[i]=0;
            digits[i-1]+=1;
            i--;
        }
        return digits;
    }
}
