package LeetCode;

public class LeetCode_64_MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int line,row;
        line=grid.length;//行数
        row=grid[0].length;//列数
        for(int i=1;i<row;i++)//第一行,注意是row
        {
            grid[0][i]=grid[0][i]+grid[0][i-1];
        }
        for(int i=1;i<line;i++)//第一列,注意是line
        {
            grid[i][0]=grid[i][0]+grid[i-1][0];
        }
        for(int i=1;i<line;i++)
        {
            for(int j=1;j<row;j++)
            {
                grid[i][j]=grid[i-1][j]<grid[i][j-1]?grid[i-1][j]+grid[i][j]:grid[i][j-1]+grid[i][j];//每个节点最小值为左上节点最小值加该节点
            }
        }
        return grid[line-1][row-1];
    }
}
