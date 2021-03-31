package com.rulinma.algorithm.leetcode.easy;

import org.junit.Test;

public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int count = 0, res;
        res = x ^ y;
        System.out.println("res: " + res);
        while (res != 0) {
            if (res % 2 == 1) {
                count++;
            }
            res = res >> 1;
            System.out.println("res: " + res);
        }
        return count;
    }

    @Test
    public void testHammingDistance() {
        System.out.println(hammingDistance(1, 4));
    }

    @Test
    public void moveZeroes() {
        int[] nums = {0,1,0,3,12};
        //
        int len = nums.length;
        int i = 0;
        int j = 0;
        while (i < len) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
            i++;
        }
        while (j < len) {
            nums[j++] = 0;
        }
        for (int x : nums) {
            System.out.println(x);
        }
    }

}
