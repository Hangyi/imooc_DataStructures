/**
 * @author ZhuHangYi
 * @create 2020-06-01 05:40
 */

public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();

}
