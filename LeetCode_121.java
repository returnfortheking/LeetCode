/*
 * @author:ReturnOfTheKing
 * 
 * 121. Best Time to Buy and Sell Stock
 * 
 * 1.遍历整个数组，diff为当前值与最小值的差，res为最后结果，min为最小值
 * 		若diff大于res则更新res，若当前值小于min则更新当前值
 */
package LeetCode;

public class LeetCode_121 {
    public int maxProfit(int[] p) {
        if(p.length<2)
        {
            return 0;
        }
        int diff=0,res=0;
        int min=p[0];
        for(int i=0;i<p.length-1;i++)
        {
            if((p[i+1]-p[i])>=0)
            {
                diff=p[i+1]-min;
            }else{
                if(p[i+1]<min)
                {
                    min=p[i+1];
                }
            }
            if(diff>res)
            {
                res=diff;
            }
        }
        return res;
    }
}
