package Linked_List_Problems_in_Leetcode;

/**
 * @author ZhuHangYi
 * @create 2020-06-08 11:24
 * 简化Solution.java
 * 因为是leetcode上的题目, 运行完会自动回收资源, 所以不用手动回收了
 */


class Solution2 {
    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) {
            return null;
        }


        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution3()).removeElements(head, 6);
        System.out.println(head);
    }

}
