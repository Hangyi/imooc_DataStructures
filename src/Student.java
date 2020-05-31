import java.security.PrivateKey;

/**
 * @author ZhuHangYi
 * @create 2020-05-31 21:12
 */


public class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {

        Array<Student> arr = new Array<>();
        arr.addLast(new Student("Alice", 100));
        arr.addLast(new Student("Bob", 88));
        arr.addLast(new Student("Charlie", 60));
        System.out.println(arr);
    }
}
