/**
 * 基于链表的带尾节点的队列
 * @author ZhuHangYi
 * @create 2020-06-08 00:10
 */


public class LinkedListQueue<E> implements Queue<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }

    }

    private Node head, tail;
    private int size; // 记录链表中存储了多少个元素

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {

        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }

        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }

        Node retNode = head;
        head = head.next;
        retNode.next = null; //注意这里不能是head = null

        if (head == null) { // 如果出现这种情况, 说明原来只有一个元素, 而现在tail是指向retNode的
            tail = null;
        }

        size--;

        return retNode.e;
    }

    @Override
    public E getFront() {
        // 注意要先判空
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty.");
        }

        return head.e;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("LinedListQueue: front ");

        Node cur = head;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }

        res.append("NULL tail");

        return res.toString();
    }


    public static void main(String[] args) {

        LinkedListQueue<Integer> queue = new LinkedListQueue<>();

        for (int i = 0; i < 11; i++) {
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }

    }

}
