public class Main {

    public static void main(String[] args) {

//        int[] arr = new int[10];
//        for(int i = 0; i< arr.length; i++)
//            arr[i] =i;
//
//        int[] scores = new int[]{100, 88, 33};
//        for(int i = 0; i<scores.length; i++)
//            System.out.println(scores[i]);
//
//        scores[1] = 99;
//
//        for(int score: scores)
//            System.out.println(score);

        Array<Integer> arr = new Array<>(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        System.out.println(arr.get(5));

        arr.set(5, 999);
        System.out.println(arr.get(5));

        System.out.println(arr);

        System.out.println(arr.contains(10));

        arr.remove(2);
        System.out.println(arr);

        int size = arr.getSize();
        System.out.println(arr.get(size-1));

//        arr.removeFirst();
//        arr.removeLast();

        arr.removeElement(999);
        System.out.println(arr);

    }
}
