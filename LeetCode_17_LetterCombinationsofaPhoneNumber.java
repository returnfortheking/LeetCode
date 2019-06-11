package LeetCode;

import java.util.*;
public class LeetCode_17_LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> l = new ArrayList();   //注意初始化的格式
        if(digits.equals(""))              //判断String为空不能用==
            return l;
        String s = new String(digits);
        int count = 0;
        int len = 0;
        l.add("");  //使l的初始长度不为0,方便后面循环
        while(count<digits.length())
        {
            len=l.size();       //记录每次的长度,因为会添加元素造成干扰
            switch (digits.charAt(count))   //注意switch的格式
            {
                case '2':
                    for(int i=0;i<len;i++)//用队列的思想,取出元素(删除原队列中的元素),分别加a,b,c后重新加回数组,循环次数由len控制
                    {
                        s=l.get(0);
                        l.remove(0);
                        l.add(s+"a");
                        l.add(s+"b");
                        l.add(s+"c");
                    }
                    break;
                case '3':
                    for(int i=0;i<len;i++)
                    {
                        s=l.get(0);
                        l.remove(0);
                        l.add(s+"d");
                        l.add(s+"e");
                        l.add(s+"f");
                    }
                    break;
                case '4':
                    for(int i=0;i<len;i++)
                    {
                        s=l.get(0);
                        l.remove(0);
                        l.add(s+"g");
                        l.add(s+"h");
                        l.add(s+"i");
                    }
                    break;
                case '5':
                    for(int i=0;i<len;i++)
                    {
                        s=l.get(0);
                        l.remove(0);
                        l.add(s+"j");
                        l.add(s+"k");
                        l.add(s+"l");
                    }
                    break;
                case '6':
                    for(int i=0;i<len;i++)
                    {
                        s=l.get(0);
                        l.remove(0);
                        l.add(s+"m");
                        l.add(s+"n");
                        l.add(s+"o");
                    }
                    break;
                case '7':
                    for(int i=0;i<len;i++)
                    {
                        s=l.get(0);
                        l.remove(0);
                        l.add(s+"p");
                        l.add(s+"q");
                        l.add(s+"r");
                        l.add(s+"s");
                    }
                    break;
                case '8':
                    for(int i=0;i<len;i++)
                    {
                        s=l.get(0);
                        l.remove(0);
                        l.add(s+"t");
                        l.add(s+"u");
                        l.add(s+"v");
                    }
                    break;
                case '9':
                    for(int i=0;i<len;i++)
                    {
                        s=l.get(0);
                        l.remove(0);
                        l.add(s+"w");
                        l.add(s+"x");
                        l.add(s+"y");
                        l.add(s+"z");
                    }
                    break;
            }
            count++;
        }
        return l;
    }
}
