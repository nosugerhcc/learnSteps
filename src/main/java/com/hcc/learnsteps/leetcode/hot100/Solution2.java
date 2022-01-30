package com.hcc.learnsteps.leetcode.hot100;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2021-12-25
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyRes = new ListNode(-1);
        ListNode curRes = dummyRes;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1CurVal = l1 == null ? 0 : l1.val;
            int l2CurVal = l2 == null ? 0 : l2.val;
            curRes.next = new ListNode((l1CurVal + l2CurVal + carry) % 10);
            curRes = curRes.next;
            carry = (l1CurVal + l2CurVal + carry) / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry == 1) {
            curRes.next = new ListNode(1);
        }
        return dummyRes.next;
    }
}
