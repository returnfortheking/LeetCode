/*
 * 13. Roman to Integer
 * 
 * 1.不要考虑多余情况，理清逻辑。
 */
package LeetCode;

public class LeetCode_13 {
    public int romanToInt(String s) {
        int res=0;
        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i)=='M')
            {
                res+=1000;
                continue;
            }
            if(s.charAt(i)=='D')
            {
                res+=500;
                continue;
            }
            if(s.charAt(i)=='C'&&i+1<s.length()&&(s.charAt(i+1)=='D'||s.charAt(i+1)=='M'))
            {
                res-=100;
                continue;
            }
            if(s.charAt(i)=='C')
            {
                res+=100;
                continue;
            }
            if(s.charAt(i)=='L')
            {
                res+=50;
                continue;
            }
            if(s.charAt(i)=='X'&&i+1<s.length()&&(s.charAt(i+1)=='D'||s.charAt(i+1)=='L'||s.charAt(i+1)=='M'||s.charAt(i+1)=='C'))
            {
                res-=10;
                continue;
            }
            if(s.charAt(i)=='X')
            {
                res+=10;
                continue;
            }
            if(s.charAt(i)=='V')
            {
                res+=5;
                continue;
            }
            if(s.charAt(i)=='I'&&i+1<s.length()&&(s.charAt(i+1)=='V'||s.charAt(i+1)=='L'||s.charAt(i+1)=='X'||s.charAt(i+1)=='C'))
            {
                res-=1;
                continue;
            }
            if(s.charAt(i)=='I')
            {
                res+=1;
                continue;
            }
        }
        return res;
    }
}
