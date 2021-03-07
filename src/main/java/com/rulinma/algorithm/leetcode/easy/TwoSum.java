package com.rulinma.algorithm.leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

//
//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
//
//        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//        你可以按任意顺序返回答案。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/two-sum
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

public class TwoSum {

    @Test
    public void test1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("" + Arrays.toString(result));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("" + Arrays.toString(result));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("" + Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        if (nums != null && nums.length >= 2) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }

        return new int[]{};
    }

}
