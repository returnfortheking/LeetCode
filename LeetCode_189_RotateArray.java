/*
 * @author:ReturnOfTheKing
 * 
 * 
 * 1.注意排除重复情况。
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
