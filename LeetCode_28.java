/*
 * author:ReturnOfTheKing
 * 
 * 28.Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * 
 * Example 2:
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * 
 * 1.直接用String.indexOf()
 * 2.用String.charAt()
 * 3.用String.substring()
 */
package LeetCode;

public class LeetCode_28 {
    public int strStr(String haystack, String needle) {
        if(haystack==null)
        {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
