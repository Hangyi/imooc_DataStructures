import java.util.Stack;

/**
 * leetcode 20 有效的括号
 *
 * @author ZhuHangYi
 * @create 2020-06-01 14:36
 */


public class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {


                if (!stack.isEmpty()) {

                    char c2 = stack.pop();

                    if (c2 == '(' && c != ')') {
                        return false;
                    }

                    if (c2 == '{' && c != '}') {
                        return false;
                    }

                    if (c2 == '[' && c != ']') {
                        return false;
                    }
                } else
                    return false;


            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        String s2 = "()[]{}";
        String s3 = "({";
        String s4 = "]";

        Solution solution = new Solution();

        System.out.println(solution.isValid(s));
        System.out.println(solution.isValid(s2));
        System.out.println(solution.isValid(s3));
        System.out.println(solution.isValid(s4));
    }
}
