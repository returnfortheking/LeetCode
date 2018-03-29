/*
 * @author:ReturnOfTheKing
 * 
 * 168. Excel Sheet Column Title
 * 
 * 1.主要注意StringBuffer里append和insert的用法。
 * 
 * 2.由于n是由n=n/26迭代的，所以每次减1不会对结果造成累积的影响。
 * 
 * 3.注意int转char的方法和char转int的方法:char可以当作int直接计算，而int转char需要强制转换。
 * 
 */
package LeetCode;

public class LeetCode_168 {
    public String convertToTitle(int n) {
        StringBuffer s=new StringBuffer();
        int temp=0;
        while(n!=0)
        {
            n=n-1;//注意样例中26对应的是Z，没有进位。将差的1减去。
            temp=n%26;
            int d='A'+temp;//char可以直接转换成int参与计算
            s.insert(0,(char) d);//StringBuffer中添加元素用append(内容)或者insert(位置，内容)
            n=n/26;
        }
        return s.toString();//转换回String。
    }
}
