package LeetCode;

public class LeetCode_62_UniquePaths {
    public int uniquePaths(int m, int n) {//建立一个m*n的矩阵,第一行第一列所有元素默认为1,之后每个节点的路径数等于他上方和左方的个数相加
        int[][] mat=new int[m][n];
        for(int i=0;i<m;i++)
        {
            mat[i][0]=1;
        }
        for(int i=0;i<n;i++)
        {
            mat[0][i]=1;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                mat[i][j]=mat[i-1][j]+mat[i][j-1];
            }
        }
        return mat[m-1][n-1];
    }
}
