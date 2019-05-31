package LeetCode;

public class LeetCode_63_UniquePathsII {
    public int uniquePathsWithObstacles(int[][] mat) {
        int line,row;
        line=mat.length;	//行数
        row=mat[0].length;	//列数
        if(mat[0][0]!=1)	//初始位置是障碍物的情况,不是路径数为1,是为0;
        {
            mat[0][0]=1;
        }else{
            mat[0][0]=0;
        }
        for(int i=1;i<line;i++)//第一行初始化
        {
            if(mat[i][0]==1)
            {
                mat[i][0]=0;
                continue;
            }
            mat[i][0]=mat[i-1][0];
        }
        for(int i=1;i<row;i++)//第一列初始化
        {
            if(mat[0][i]==1)
            {
                mat[0][i]=0;
                continue;
            }
            mat[0][i]=mat[0][i-1];
        }
        for(int i=1;i<line;i++)//循环,遇到障碍置零
        {
            for(int j=1;j<row;j++)
            {
                if(mat[i][j]!=1)
                {
                    mat[i][j]=mat[i-1][j]+mat[i][j-1];
                }else{
                    mat[i][j]=0;
                }
            }
        }
        return mat[line-1][row-1];//矩阵右下即为路径数
    }
}
