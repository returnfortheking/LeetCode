package LeetCode;

public class LeetCode221_MaximalSquare {
    public int maximalSquare(char[][] mat) {
        if(mat.length==0)
            return 0;
        int square=0;
        int[] row=new int[mat[0].length];
        int line=mat.length;
        for(int j=0;j<row.length;j++)
        {
            row[0]=0;
        }
        for(int i=0;i<line;i++)
        {
            for(int j=0;j<row.length;j++)//计算每行的row数组,即这行每个点上方有多少个连续的1;
            {
                if(mat[i][j]=='0')//注意是char
                    row[j]=0;
                if(mat[i][j]=='1')
                    row[j]+=1;
            }
            square=Math.max(square,max_calculate(row));//利用函数计算到这行为止的最大正方形
        }
        return square;
    }
    public int max_calculate(int[] row)
    {
        int res=0;
        int[] squa=new int[row.length];//构建一个1,2,3,4,5...的数组,
        for(int i=0;i<row.length;i++)
        {
            squa[i]=i+1;
        }
        for(int i=0;i<row.length;i++)//每读取一个row[]的元素,更新squa矩阵,一旦出现小于1的值,更新最大值.
        {
            for(int j=row[i];j<row.length;j++)
            {squa[j]=j+1;}
            for(int k=0;k<row[i]&&k<squa.length;k++)//注意row[i]可能大于squa的长度,要把两个条件都写上
            {
                squa[k]=squa[k]-1;
                if(squa[k]<1)
                    res=Math.max(res,(k+1)*(k+1));
            }
        }
        return res;
    }
}
