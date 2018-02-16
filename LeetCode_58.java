/*
 * @author:ReturnOfTheKing
 * 
 * Length of Last Word
 * 
 * 1.先去掉末尾的连续空格，然后从末尾向前遍历剩余字符串并计数，出现空格跳出
 */
package LeetCode;

public class LeetCode_58 {
    public int lengthOfLastWord(String s) {
        if(s.length()==0||s==null)
        {
            return 0;
        }
        char[] c=s.toCharArray();
        int len=0;
        for(int j=s.length()-1;j>=0;j--)
        {
            if(c[j]==' ')
            {
                s=s.substring(0,j);
            }else{
                break;
            }
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            if(c[i]==' ')
            {
                break;
            }
            len++;
        }
        return len;
    }
}
