/*
 * @author:ReturnOfTheKing
 * 
 * 69. Sqrt(x)
 * 
 * 1.二分查找。
 */
package LeetCode;

import java.awt.print.Printable;

public class LeetCode_69 {
    public int mySqrt(int x) {
        if(x<2)
        {
            return x;
        }
        int l=0,r=x,mid=0;
        while(l<=r)//二分查找
        {
            mid=l+(r-l)/2;
        if(x/mid==mid)
        {
            return mid;
        }else if(x/mid>mid)
        {
            l=mid+1;
        }else{
            r=mid-1;
        }
        }
        if(x/mid<mid)//排除当mid大于sqrt但循环结束的特殊情况
        {
            mid--;
        }
        return mid;
    }
    public static void main(String[] args) {
		LeetCode_69 l=new LeetCode_69();
		int a=156874;
		System.out.println(l.mySqrt(a));
	}
}
