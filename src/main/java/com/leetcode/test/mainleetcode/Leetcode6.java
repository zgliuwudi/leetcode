package com.leetcode.test.mainleetcode;

/**
 * @ClassName: Six
 * @program: leetcode
 * @Description: Z字形变换
 * @Author: admin
 * @Date: 2020/2/16 23:46
 * @Version: 1.0
 **/
public class Leetcode6 {

    /**
     * @param s    输入字符串
     * @param numRows 行数
     * @return
     */
    public String conver(String s, int numRows) {
        if (numRows < 0 || null == s) {
            return null;
        }
        if (numRows == 1) {
            return s;
        }
        String[] req = new String[numRows];
        for (int i=0;i<numRows;i++) {
            req[i]="";
        }
        boolean toDown = true;
        int rowIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            req[rowIndex] = req[rowIndex] + s.charAt(i);
            if (toDown) {
                ++rowIndex;
            } else {
                --rowIndex;
            }
            if (rowIndex == 0) {
                toDown = true;
            }
            if (rowIndex == numRows - 1) {
                toDown = false;
            }
        }
        StringBuffer sbf = new StringBuffer();
        for (int i=0;i<numRows;i++) {
            sbf.append(req[i]);
        }
        return sbf.toString();
    }

    public static void main(String[] args) {
        Leetcode6 six = new Leetcode6();
        System.out.println(six.conver("LEETCODEISHIRING", 3));
    }

}
