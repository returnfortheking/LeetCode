/*
 * @author:ReturnOfTheKing
 * 
 * 5.Longest Palindromic Substring
 * 		Given a string s, find the longest palindromic substring in s. 
 * 		You may assume that the maximum length of s is 1000.
 * 
 * 1.n^2时间复杂度n空间复杂度:遍历每个点，计算每个点为中心的最长回文串，记录最大的一个。遍历n*计算回文串n=n^2,计算回文串耗费n空间。
 */

package LeetCode;

public class LeetCode_5 {
    public String itsPalindrome(String s,int len){
	    StringBuffer sub1=new StringBuffer();
	    StringBuffer sub2=new StringBuffer();
	    sub1.append(s.charAt(len));
	    for(int i=1;(len-i>=0)&&(len+i<s.length());i++)
	    {
	        if(s.charAt(len+i)==s.charAt(len-i))
	        {
	            sub1.append(s.charAt(len-i));
	            sub1.insert(0,s.charAt(len-i));
	            continue;
	        }
	        break;
	    }
	    for(int i=1;(len-i+1>=0)&&(len+i<s.length());i++)
	    {
	        if(s.charAt(len+i)==s.charAt(len-i+1))
	        {
	            sub2.append(s.charAt(len+i));
	            sub2.insert(0,s.charAt(len+i));
	            continue;
	        }
	        break;
	    }
	    if(sub1.length()<sub2.length())
	    {
	        return sub2.toString();
	    }
	    return sub1.toString();
	}
	public String longestPalindrome(String s) {
	    String res="";
	    for(int i=0;i<s.length();i++)
	    {
	        if(itsPalindrome(s,i).length()>res.length())
	        {
	            res=itsPalindrome(s,i);
	        }
	    }
	    return res;
	}
	public static void main(String[] args) {
		LeetCode_5 l=new LeetCode_5();
		String a="aaaa";
		System.out.println(l.longestPalindrome(a));
	}
}
