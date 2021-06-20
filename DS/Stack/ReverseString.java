import java.util.Stack;

public class ReverseString {

    public void reverseString(String data) {
        Stack<Character> stack = new Stack<>();
        char[] ch = data.toCharArray();

        for (char c : ch) {
            stack.push(c);
        }

        for (int i = 0; i < data.length(); i++) {
            ch[i] = stack.pop();
        }
        System.out.println(String.valueOf(ch));

    }

    public static void main(String[] args) {
        ReverseString rv = new ReverseString();
        rv.reverseString("shahrukh");
    }

}
