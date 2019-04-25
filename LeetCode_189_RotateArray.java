/*
 * @author:ReturnOfTheKing
 * 
 * 
 * 1.冒泡排序类似,时间O(kn),空间O(1)
 * 2.先翻转整个数组,然后分别翻转前k和后n-k.时间O(n),空间O(1)
 */
package LeetCode;

public class LeetCode_189_RotateArray {
    public void rotate(int[] nums, int k) {
        if(nums.length==0)//类似冒泡排序,每次将最右元素移至左边,其余元素依次向右移1位
        {
            return;
        }
        int step,l,temp;
        l=nums.length;
        step=k%nums.length;
        for(int j=0;j<step;j++)
        {

            for(int i=l-1;i>0;i--)
            {
                temp=nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=temp;
            }

        }

    }
}
