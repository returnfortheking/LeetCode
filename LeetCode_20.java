/*
 * author:ReturnOfTheKing
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 * 1.堆栈实现
 * 
 * 2.replace实现，巨慢无比
 * 		注意：replace并不会改变原值，需要赋值才能改变。
 * 			''为char类型，""为string类型。
 */
package LeetCode;

import java.util.Stack;

public class LeetCode_20 {
	public boolean isValid(String s) {//堆栈实现
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
    public boolean isValid1(String s) {//只能实现单个的(){}[]这种判别，无法识别嵌套。
        if(s.length()==0||s==null)
        {
            return true;
        }
        if(s.length()%2!=0)
        {
            return false;
        }
        int l=s.length();
        while(l>0)
        {
            if(s.indexOf("()")!=0&&s.indexOf("{}")!=0&&s.indexOf("[]")!=0)
            {
                return false;
            }
            s.substring(2,s.length());
            l=l-2;
        }
        return true;
    }
    public boolean isValid2(String s) {//只能识别总数，嵌套错误识别不出，如[(])
        if(s.length()==0||s==null)
        {
            return true;
        }
        int a=0,b=0,c=0;
        for(char d:s.toCharArray())
        {
            if(d=='(')
            {
                a++;
            }else if(d==')')
            {
                a--;
            }
            if(d=='[')
            {
                b++;
            }else if(d==']')
            {
                b--;
            }
            if(d=='{')
            {
                c++;
            }else if(d=='}')
            {
                c--;
            }
        }
        if(a==0&&b==0&&c==0)
        {
            return true;
        }
        return false;
    }
    public boolean isValid3(String s) {//正确答案，注意，replace只是输出，并不改变原值
        if(s.length()==0||s==null)
        {
            return true;
        }
        int l=s.length();
        while(l>0)
        {
        	if(s.indexOf("()")!=-1)
        	{
        		s=s.replace("()", "");
        		l=s.length();
        		continue;
        	}
        	if(s.indexOf("[]")!=-1)
        	{
        		s=s.replace("[]", "");
        		l=s.length();
        		continue;
        	}
        	if(s.indexOf("{}")!=-1)
        	{
        		s=s.replace("{}", "");
        		l=s.length();
        		continue;
        	}
        	return false;
        }
        return true;
    }
    public static void main(String[] args) {
		LeetCode_20 l=new LeetCode_20();
		String s="()()()";
		if(l.isValid3(s))
		{
			System.out.println(1);
		}else{
			System.out.println(2);
		}
	}
}
