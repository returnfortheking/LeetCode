/*
 * @author:ReturnOfTheKing
 * 
 * 1.转成int,然后递归,当string过长时超过int范围,较短时正确.
 */
package LeetCode;

public class LeetCode_91_Decode_Ways {
    public int numDecodings_1(String s) {
        if(s.length()==0||s==null)
            return 0;
        int str=Integer.parseInt(s);
        return count(str);
    }
    public int count(int s){
        if(s==0)
            return 0;
        if(s<=10)
            return 1;
        if(s%100<27)
            {
                return 1+count(s/10);
            }
        return count(s/10);

    }
}
