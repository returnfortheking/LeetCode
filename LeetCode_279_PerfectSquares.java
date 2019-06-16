package LeetCode;

public class LeetCode_279_PerfectSquares {
    public int numSquares(int n) {
        if(n<4)
            return n;
        int[] min=new int[n+1];
        min[0]=0;
        min[1]=1;
        min[2]=2;
        min[3]=3;
        for(int j=4;j<min.length;j++){
            int i=1;
            while(i*i<=j)		//找到小于n的最小的i
            {
                min[i*i]=1;
                i++;
            }
            i--;
            int temp=Integer.MAX_VALUE;
            if(i*i==j)
            {min[j]=1;}
            else{
            for(;i>1;i--)		//依次减小i,找到最小的分割结果
            {
                temp=Math.min(temp,min[j-i*i]);
            }
            min[j]=temp+1;}
        }
        return min[n];
    }
}
