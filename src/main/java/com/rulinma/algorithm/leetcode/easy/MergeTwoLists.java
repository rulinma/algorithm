package com.rulinma.algorithm.leetcode.easy;

import org.junit.Test;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        // 比较2个链表的值
        ListNode t1 = l1;
        ListNode t2 = l2;
        while (t1 != null && t2 != null) {
            // 设置head
            if (head == null) {
                if (t1.val <= t2.val) {
                    head = t1;
                    current = head;
                    t1 = t1.next;
                } else {
                    head = t2;
                    t2 = t2.next;
                    current = head;
                }
            } else {
                // 其他设置
                if (t1.val <= t2.val) {
                    current.next = t1;
                    current = current.next;
                    t1 = t1.next;
                } else {
                    current.next = t2;
                    current = current.next;
                    t2 = t2.next;
                }
            }
        }

        //
        if (t1 == null) {
            current.next = t2;
        }
        if (t2 == null) {
            current.next = t1;
        }

        return head;
    }

    @Test
    public void testMergeTwoLists() {
        ListNode ll = new ListNode();
        ListNode l4 = new ListNode(4);
        ListNode l2 = new ListNode(2, l4);
        ListNode l1 = new ListNode(1, l2);

        ListNode lr = new ListNode();
        ListNode r4 = new ListNode(4);
        ListNode r3 = new ListNode(3, r4);
        ListNode r1 = new ListNode(1, r3);
        ListNode result = mergeTwoLists(l1, r1);
        System.out.println(result);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
}
