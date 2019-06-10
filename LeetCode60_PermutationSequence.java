package LeetCode;

public class LeetCode60_PermutationSequence {
    public String getPermutation(int n, int k) {
        if(n==1)
            return "1";
        int temp=0;
        StringBuffer s = new StringBuffer(n);//涉及字符串修改,所以用StringBuffer存储.
        StringBuffer num = new StringBuffer("");
        for(int i=1;i<=n;i++)
        {
            num.append(String.valueOf(i));//生成一个123456...的字符串用于取字符
        }
        k=k-1;
        n=n-1;
        while(n>0)                          //用k除(n-1)!得到商和余数,取商下标的加入保存结果用的字符串,余数赋值给k,循环.
        {
            temp=k/(plus(n));
            k=k%(plus(n));
            s.append(num.charAt(temp));
            num.deleteCharAt(temp);
            n--;
        }
        s.append(num.charAt(0));
        return s.toString();                //返回值是String,要进行转换
    }
    public int plus(int n)              //计算阶乘的函数
    {
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        int res=1;
        for(int i=2;i<=n;i++)
        {
            res=res*i;
        }
        return res;
    }
}
