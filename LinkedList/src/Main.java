public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i); // 对于链表来说addFirst这个方法是o1级别的
            System.out.println(linkedList);
        }

        linkedList.add(2, 666);
        System.out.println(linkedList);

        linkedList.addLast(999);
        System.out.println(linkedList);

        System.out.println(linkedList.contains(999));
        System.out.println(linkedList.contains(99));

        System.out.println("first = " + linkedList.getFirst());

        System.out.println("last = " + linkedList.getLast());


        // 测试链表删除
        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
