/*
 * @author:ReturnOfTheKing
 * 
 * Longest Substring Without Repeating Characters
 * 
 * 
 * 1.双层嵌套，timeout。
 * 2.用StringBuffer，边遍历边删除。学了KMP算法以后发现和KMP的思想很接近。
 */
package LeetCode;


import java.util.HashMap;

public class LeetCode_3 {
    public int lengthOfLongestSubstring_1(String s) {
        if(s==null||s.length()==0)
        {
            return 0;
        }
        HashMap<Character, Integer> h=new HashMap<Character, Integer>();
    	StringBuffer subString=new StringBuffer();
    	int i=0,sub=1;
        char[] c=new char[s.length()];
        c=s.toCharArray();
        for(int k=0;k<s.length();k++)
        {
        	for(int j=k;j<s.length();j++)
            {
            	char temp=c[j];
            	if(h.containsKey(temp))
            	{
            		if(i>sub)
                    {
                        sub=i;
                    }
            		i=1;
            		h.clear();
                    h.put(temp,1);
            		continue;
            	}
            	h.put(temp,1);
            	i++;
                if(i>sub)
                    {
                        sub=i;
                    }
            	subString.append(temp);
            }
        	h.clear();
        	i=0;
        }
        
        return sub;
    }
    public int lengthOfLongestSubstring_2(String s) {
        if(s==null||s.length()==0)
        {
            return 0;
        }
        StringBuffer sublist=new StringBuffer();
    	int i=0,sub=1;
        char[] c=new char[s.length()];
        c=s.toCharArray();//String转char数组
        	for(int r=0;r<s.length();r++)
            {
            	char temp=c[r];
            	if(sublist.indexOf(String.valueOf(temp))!=-1)//是否包含该字符
            	{
                	sublist.append(temp);//添加新字符
            		sublist.delete(0,sublist.indexOf(String.valueOf(temp))+1);//StringBuffer中的删除操作(左删除右不删)
                	sub=sub<sublist.length()?sublist.length():sub;//布尔?a:b,为真取a,为假取b。
                	continue;
            	}
            	sublist.append(temp);
            	sub=sub<sublist.length()?sublist.length():sub;
            	
            }
        System.out.println(sublist);
        return sub;
    }
	public static void main(String[] args) {
		LeetCode_3 l=new LeetCode_3();
		String s="abcdabcdabcdefg";
		System.out.println(l.lengthOfLongestSubstring_2(s));

	}

}
