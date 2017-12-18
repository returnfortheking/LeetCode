/*
 * author:ReturnOfTheKing
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 求最长前缀子字符串
 * 
 * 1.indexOf()输出子字符串位置，不包含此字符串输出-1
 * 	循环，每次将最后一位截去。直到子字符串位置为0
 * 
 * 2.先用Array.sort()排序，然后只比较首位两个字符串。
 * 
 * 3.toCharArray()将字符串转化为char数组
 * 4.String初始值为null，StringBuffer和StringBuilder初始值为“”
 */
package LeetCode;

import java.util.Arrays;

public class LeetCode_14 {
	public String longestCommonPrefix1(String[] strs) {
	    if(strs == null || strs.length == 0)    return "";
	    String pre = strs[0];
	    int i = 1;
	    while(i < strs.length){
	        while(strs[i].indexOf(pre) != 0)//String.indexOf(String) 输出子字符串位置，不包含此字符串输出-1
	            pre = pre.substring(0,pre.length()-1);//截去最后一位
	        i++;
	    }
	    return pre;
	}
    public String longestCommonPrefix2(String[] strs) {//先排序，然后直接比较首尾的字符串
        StringBuilder result = new StringBuilder();//StringBuffer和StringBuilder初始值为“”，而String初始值为null
        
        if (strs!= null && strs.length > 0){
        
            Arrays.sort(strs);
            
            char [] a = strs[0].toCharArray();
            char [] b = strs[strs.length-1].toCharArray();
            
            for (int i = 0; i < a.length; i ++){
                if (b.length > i && b[i] == a[i]){
                    result.append(b[i]);
                }
                else {
                    return result.toString();
                }
            }
        }
        return result.toString();
    }
	public String longestCommonPrefix_self(String[] strs) {//将数据存入char数组，然后比较，巨蠢无比
        if(null==strs||strs.length==0)//当为“”和null时直接输出“”
        {
            return "";
        }
        int l=0;
        String result="";
        if(strs.length==1)//当只有一个字符串时输出其本身
        {
            return strs[0];
        }
        for(String s:strs)//求字符串最长长度
        {
            if(l<s.length())
            {
                l=s.length();
            }
        }
        char[][] temp=new char[l][strs.length];//建立char二维数组
        for(int i=0;i<strs.length;i++)//将数据存入二维数组
        {
            int j=0;
        	for(char c:strs[i].toCharArray())
        	{
                temp[j][i]=strs[i].toCharArray()[j];
                j++;
        	}
        	j=0;

        }
        for(int j=0;j<l;j++)
        {
            for(int m=0;m<strs.length-1;m++)
            {
                if(temp[j][m]!=temp[j][m+1])
                {
                    return result;//出现不同直接跳出循环并输出结果
                }else if(temp[j][m]==temp[j][m+1]&&m!=strs.length-2)//没比较完继续比较
                {
                	continue;
                }else {//比较结束更新结果
                    result+=temp[j][0];
				}
            }
        }
        return result;       
    }
    public static void main(String[] args) {
		LeetCode_14 l=new LeetCode_14();
		String[] s={"abc","abcba"};
		System.out.println(l.longestCommonPrefix_self(s));
	}
}
