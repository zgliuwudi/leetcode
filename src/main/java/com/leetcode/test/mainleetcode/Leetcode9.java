package com.leetcode.test.mainleetcode;

/**
 * @ClassName: Leetcode9
 * @program: leetcode
 * @Description: 回文数
 * @Author: admin
 * @Date: 2020/2/18 23:13
 * @Version: 1.0
 **/
public class Leetcode9 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        StringBuffer sbf1 = new StringBuffer();
        for (int i = 0; i < (x+"").length(); i++) {
            sbf1.append((x + "").charAt(i));
        }
        StringBuffer sbf2 = new StringBuffer();
        for (int i = (x+"").length()-1; i >=0; i--) {
            sbf2.append((x + "").charAt(i));
        }
        if (sbf1.toString().endsWith(sbf2.toString())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode9 leetcode9 = new Leetcode9();
        System.out.println(leetcode9.isPalindrome(10));
    }
}
