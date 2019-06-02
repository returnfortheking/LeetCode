package LeetCode;
import java.util.*;

public class LeetCode_120_Triangle {
    public int minimumTotal(List<List<Integer>> tri) {
        //排除只有一个list的情况
    	if(tri.size()==1)
        {
            return tri.get(0).get(0);//list.size():求list的长度,list.get(i)取第i个位置的元素
        }
        int len = tri.size();
        int temp1 = 0;
        int temp2 = 0;
        int[] res = new int[len];//构建一个和最后一个list等长的数组
        //排除只有两个list的情况
        res[0] = tri.get(0).get(0)+tri.get(1).get(0);
        res[1] = tri.get(0).get(0)+tri.get(1).get(1);
        for(int i=2;i<len;i++)
        {
            res[i] = res[i-1]+tri.get(i).get(i);//每次更新数组,最后一个元素不受影响,可优先更新
            temp1=res[0];	//缓存第一个元素,以免更新后无法判断
            res[0]+=tri.get(i).get(0);//更新
            for(int j=1;j<i;j++)
            {
                temp2 = res[j];//缓存当前更新的元素
                res[j]=Math.min(temp1,res[j])+tri.get(i).get(j);//更新
                temp1 = temp2;//替换更新用的缓存元素
            } 
        }
        for(int i=1;i<len;i++)//找到最小值
        {
            if(res[0]>res[i])
                res[0]=res[i];
        }
        return res[0];
    }
}
