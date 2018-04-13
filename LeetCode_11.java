/*
 * @author:ReturnOfTheKing
 * 
 * 11. Container With Most Water
 * 
 * 1.先固定一个点，然后从后往前遍历。 timeout。仔细分析后发现存在重复计算。
 * 		例如左高右低的情况，当左边再变高时会有多余计算和比较。
 * 
 * 2.左右指针，从小的一边往中间遍历，一旦低的一边变高则更新数据。
 * 
 * 
 */
package LeetCode;

public class LeetCode_11 {
//    public int maxArea_self1_timeout(int[] h) {
//        int temp=0,l=h[0],r=h[h.length-1];
//        int sum=(h.length-1)*Math.min(l,r);
//        for(int i=0;i<h.length-1;i++)
//        {
//        	temp=(h.length-1-i)*Math.min(h[i],h[h.length-1]);
//            if(sum<=temp)
//            {
//                sum=temp;
//            }
//        	if(h[i]<l)//遇到更低的点直接略过
//            {
//                continue;
//            }else{
//                l=h[i];//遇到更高的点记录
//            }
//            r=h[h.length-1];
//            for(int j=h.length-1;j>i;j--)
//            {
//                if(h[j]<=r)//遇到更低的点直接略过
//                {
//                    continue;
//                }else{
//                    r=h[j];//遇到更高的点记录
//                }
//                temp=(j-i)*Math.min(h[i],h[j]);
//                if(sum<temp)
//                {
//                    sum=temp;
//                }
//            }
//        }
//        return sum;
//    }
    public int maxArea(int[] h) {
        int lm=0,rm=h.length-1;
        int sum=0;
        sum=biggerArea(lm,rm,h,sum);
        for(int i=0,j=h.length-1;i<j;)
        {
            if(h[lm]>=h[rm])
            {
                j--;
                if(h[j]>h[rm])
                {
                    rm=j;
                    sum=biggerArea(lm,rm,h,sum);
                }
            }else{
                i++;
                if(h[i]>h[lm])
                {
                    lm=i;
                    sum=biggerArea(lm,rm,h,sum);
                }
            }
        }
        return sum;
        
    }
    public int biggerArea(int i,int j,int[] h,int sum){
    	return Math.max(sum,Math.min(h[i],h[j])*(j-i));
        //用下面这句时会提示timeout，猜想是因为存在了一次对Math.min(h[i],h[j])*(j-i)的重复计算。
    	//return sum>(Math.min(h[i],h[j])*(j-i))?sum:Math.min(h[i],h[j])*(j-i);
    }
    public static void main(String[] args) {
		LeetCode_11 l=new LeetCode_11();
		int[] n={1,2,4,3};
		System.out.println(l.maxArea(n));
	}
}
