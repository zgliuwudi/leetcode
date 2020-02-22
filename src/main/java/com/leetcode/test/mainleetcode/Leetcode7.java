package com.leetcode.test.mainleetcode;

/**
 * @ClassName: Leetcode7
 * @program: leetcode
 * @Description: 整数反转
 * @Author: admin
 * @Date: 2020/2/17 0:28
 * @Version: 1.0
 **/
public class Leetcode7 {

    public int reverse(int x) {
        String str = x + "";
        String result = "";
        for (int i = str.length() - 1; i > 0; i--) {
            if (result.equals("") && str.charAt(i) == 0) {
                continue;
            } else {
                result += str.charAt(i);
            }
        }
        if (x < 0) {
            result = "-" + result;
        } else {
            result += str.charAt(0);
        }
        Long data = Long.parseLong(result);
        if (data > Integer.MAX_VALUE || data < Integer.MIN_VALUE) {
            return 0;
        }
        return data.intValue();
    }

    public static void main(String[] args) {
        Leetcode7 leetcode7 = new Leetcode7();
        System.out.println(leetcode7.reverse(-123));
    }
}
