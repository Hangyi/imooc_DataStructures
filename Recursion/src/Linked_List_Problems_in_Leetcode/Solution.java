package Linked_List_Problems_in_Leetcode;

/**
 * leetcode 203 移除链表元素
 * @author ZhuHangYi
 * @create 2020-06-08 10:50
 */

// 不使用头结点的方法
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val){
            ListNode delNode = head;
            head = head.next;
            delNode = null;
        }

        if(head == null){
            return null;
        }


        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.val == val){
                ListNode delNode = prev.next;
                prev.next = prev.next.next;
                delNode = null;
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
