package com.rulinma.algorithm.basic.recursion;

import org.junit.Test;

public class SunRecursion {

    int depth = 0;

    @Test
    public void testSum() {
        System.out.println(sum(4));
    }

    public int sum(int x) {
        String depthString = generateDepthString(depth++);
        if (x == 0) {
            System.out.println("r" + depthString + x);
            return 0;
        }
        System.out.println("s" + depthString + x);
        int result= sum(x - 1) + x;
        System.out.println("r" + depthString + x);
        return result;
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }
}
