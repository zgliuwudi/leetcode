package com.leetcode.test.mainleetcode;

/**
 * @ClassName: Leetcode8
 * @program: leetcode
 * @Description: 字符串转换整数 (atoi)
 * @Author: admin
 * @Date: 2020/2/18 0:03
 * @Version: 1.0
 **/
public class Leetcode8 {

    public int myAtoi(String str) {
        if (str.equals("")) {
            return 0;
        }
        boolean firstData = true;
        StringBuffer sbf = new StringBuffer();
        int count = 0;
        for (int i=0;i<str.length();i++) {
            // 第一个字符前空格去掉 Character.isSpaceChar方法使用
            if (firstData && Character.isSpaceChar(str.charAt(i)) ) {
                continue;
            }else {
                firstData = false;
                ++count;
                // 判断第一个字母是-号或者+号的情况
                if (count == 1) {
                    if (str.charAt(i) == '-'||str.charAt(i)=='+') {
                        sbf.append(str.charAt(i));
                        continue;
                    }
                    // 其他字符的情况
                    if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                        return 0;
                    }
                    sbf.append(str.charAt(i));
                }else{
                    if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                        break;
                    }
                    sbf.append(str.charAt(i));
                }

            }
        }
        if (sbf.toString().equals("")||sbf.toString().equals("-")||sbf.toString().equals("+")){
            return 0;
        }
        // 判断是否超限
        Integer data;
        try {
            data = Integer.parseInt(sbf.toString());
        }catch (Exception e){
            if (sbf.toString().startsWith("-")) {
                return Integer.MIN_VALUE;
            }else{
                return Integer.MAX_VALUE;
            }
        }
        return data.intValue();
    }

    public static void main(String[] args) {
        Leetcode8 leetcode8 = new Leetcode8();
        System.out.println("20000000000000000000".length()>(Long.MAX_VALUE+"").length());
        System.out.println(leetcode8.myAtoi( "--20000000000000000000"));
    }
}
