package com.rulinma.algorithm.leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
//
//        注意：答案中不可以包含重复的三元组。
//
//
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/3sum
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

public class ThreeSum {

    @Test
    public void test1() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        int target = 0;
        int[] result = threeSum(nums, target);
        System.out.println("" + Arrays.toString(result));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{};
        int target = 0;
        int[] result = threeSum(nums, target);
        System.out.println("" + Arrays.toString(result));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{0};
        int target = 0;
        int[] result = threeSum(nums, target);
        System.out.println("" + Arrays.toString(result));
    }

    public int[] threeSum(int[] nums, int target) {
        //
        if (nums != null && nums.length >= 3) {
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] + nums[k] == target) {
                            return new int[]{i, j, k};
                        }
                    }
                }
            }
        }

        return new int[]{};
    }

}
