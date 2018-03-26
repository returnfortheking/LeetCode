/*
 * @author:ReturnOfTheKing
 * 
 * 67. Add Binary
 */
package LeetCode;

public class LeetCode_67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();//可以用append和reverse
        int i = a.length() - 1, j = b.length() -1, carry = 0;//记录进位和a,b字符串的长度
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';//有1就在sum处+1
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);//添加数字
            carry = sum / 2;//更新进位
        }
        if (carry != 0) sb.append(carry);//如果全部结束后进位不为0，前面填1
        return sb.reverse().toString();//反转字符串后输出
    }
}
