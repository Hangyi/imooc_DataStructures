/**
 * @author ZhuHangYi
 * @create 2020-06-01 17:54
 */


public interface Queue<E> {

    void enqueue(E e);

    E dequeue();

    E getFront();

    int getSize();

    boolean isEmpty();

}
