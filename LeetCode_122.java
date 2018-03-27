/*
 * @author:ReturnOfTheKing
 * 
 * 122. Best Time to Buy and Sell Stock II
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * 
 * 	Design an algorithm to find the maximum profit. 
 * 	You may complete as many transactions as you like 
 * 	(buy one and sell one share of the stock multiple times). 
 * 	However, you may not engage in multiple transactions at the same time 
 * 	(you must sell the stock before you buy again).
 * 
 * 1.依次计算相邻两数差值，大于0累加，小于0忽略。最后输出差值之和
 * 
 */
package LeetCode;

public class LeetCode_122 {
    public int maxProfit(int[] p) {
        if(p.length<2)
        {
            return 0;
        }
        int diff=0;
        for(int i=0;i<p.length-1;i++)
        {
            if((p[i+1]-p[i])>=0)
            {
                diff+=p[i+1]-p[i];
            }

        }
        return diff;
    }
}
