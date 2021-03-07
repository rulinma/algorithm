package com.rulinma.algorithm.leetcode.easy;

import org.junit.Test;

public class NumberOnlyOnce {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int x : nums) {
            result = result ^ x;
        }
        return result;
    }

    @Test
    public void testOnlyOnce() {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}
