/**
 * @author ZhuHangYi
 * @create 2020-06-01 17:54
 */


public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();

}
