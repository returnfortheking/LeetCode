package LeetCode;

import java.util.*;

public class LeetCode264_UglyNumberII {
    public int nthUglyNumber(int n) {
    	//对下面一个数组进行优化,记录每个丑数*235得到的新丑数时,记录位置,这样更新的时候不用全部都更新([2][3][5]用来存储下一个要更新的丑数)
    	//比如1,此时1在[2][3][5]中,所以更新[2][3][5]从111到235,并改变记录的位置000为111
    	//然后取下一个丑数,为最小的2,和[2]相等,更新位置为211,更新[2]为2*2=4.      1,2
    	//然后取下一个,为最小的3,和[3]相等,更新位置为221,更新[3]为2*3=6
    	//然后取4,和[2]相等,更新位置为321,更新[2]为3*2=6
    	//...
        List<Integer> s = new ArrayList<>();//存储丑数
        int count=0;//迭代系数
        int a;//临时变量
        int two,thr,fiv,i2,i3,i5;//存235数组当前的最小值,以及是哪个丑数的235
        two=thr=fiv=1;
        i2=i3=i5=0;
        while(count<n)
        {
            s.add(Math.min(Math.min(two,thr),fiv));//找到三个数组中最小的,更新成下一个丑数
            a=s.get(count);//取这个丑数
            if(a==two)//与数组最小值相等,更新数组
                two=s.get(i2++)*2;
            if(a==thr)
                thr=s.get(i3++)*3;
            if(a==fiv)
                fiv=s.get(i5++)*5;
            count++;
        }
        return s.get(n-1);
    }
	
	
//	1.用list存储,每存3个存一下,排序,输出第n个,此方法在1300以后失效,感觉是因为超出了Integer的范围,导致存了错误的值造成干扰.	
    public int nthUglyNumber1(int n) {
        List<Integer> s = new ArrayList<>();
        int count=0;
        int a=1;
        int[] b={2,3,5};
        s.add(a);
        while(count<n)
        {
            Collections.sort(s);
            a=s.get(count);
            for(int i=0;i<b.length;i++)
            {
                if(!s.contains(a*b[i]))
                   s.add(a*b[i]);
            }
            count++;
        }
        Collections.sort(s);
        return s.get(n-1);
    }
//	2.遍历,时间超出限制.
//    public int nthUglyNumber(int n) {
//        int count=0;
//        int ugly=1;
//        int a;
//        while(count<n)
//        {
//            a=ugly;
//            while(a%2==0)//能整除,就继续除
//            {
//                a = a/2;
//            }
//            while(a%3==0)
//            {
//                a = a/3;
//            }
//            while(a%5==0)
//            {
//                a = a/5;
//            }
//            if(a==1)//全部整除,最后为1
//                count++;
//            ugly++;    
//        }
//        return ugly-1;
//    }
}
