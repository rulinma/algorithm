package com.rulinma.algorithm.leetcode.easy;

import org.junit.Test;

public class Palindrome {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String y = String.valueOf(x);
        int start = 0;
        int end = y.length() - 1;
        while (start < end) {
            // 每个不相等
            if (!y.substring(start, start + 1).equals(y.substring(end, end + 1))) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    @Test
    public void test1() {
        int x = 121221;
        System.out.println(isPalindrome(x));
    }

    @Test
    public void test2() {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    @Test
    public void test3() {
        int x = -121;
        System.out.println(isPalindrome(x));
    }

    @Test
    public void test4() {
        int x = 0;
        System.out.println(isPalindrome(x));
    }
}
