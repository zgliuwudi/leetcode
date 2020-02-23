package com.leetcode.test.mainleetcode;

/**
 * @ClassName: Leetcode10
 * @program: leetcode
 * @Description: 正则表达式匹配
 * @Author: admin
 * @Date: 2020-02-23 09:14
 * @Version: 1.0
 **/
public class Leetcode10 {

    public boolean isMatch(String s, String p) {
        if (null == s || null == p) {
            return false;
        }
        return s.matches(p);
    }

    public static void main(String[] args) {
        Leetcode10 leetcode10 = new Leetcode10();
        System.out.println(leetcode10.isMatch("aa","a"));
        System.out.println(leetcode10.isMatch("aa","a*"));
        System.out.println(leetcode10.isMatch("ab",".*"));
        System.out.println(leetcode10.isMatch("aab","c*a*b"));
        System.out.println(leetcode10.isMatch("mississippi","mis*is*p*."));
        System.out.println(leetcode10.isMatch(null,"mis*is*p*."));
        System.out.println(leetcode10.isMatch("mississippi",null));
        System.out.println(leetcode10.isMatch(null,null));
    }

}
