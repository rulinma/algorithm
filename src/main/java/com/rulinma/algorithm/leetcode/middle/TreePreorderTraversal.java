package com.rulinma.algorithm.leetcode.middle;

import com.rulinma.algorithm.leetcode.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        traversal(root, result);

        for (Integer i : result) {
            System.out.println(i);
        }
        return result;
    }

    public void traversal(TreeNode node, List<Integer> list) {
        if (node != null) {
            list.add(node.val);
            traversal(node.left, list);
            traversal(node.right, list);
        }
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);


        preorderTraversal(root);
    }

}
