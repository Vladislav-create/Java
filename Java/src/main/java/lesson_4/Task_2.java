package lesson_4;

import java.util.Stack;

public class Task_2 {
    static Stack<Integer> in;
    static Stack<Integer> out;

    public static void main(String[] args) {

    }

//    public static void MyQueue() {
//        in = new Stack<>();
//        out = new Stack<>();
//     }

    public static void push(int x) {
        while (!out.isEmpty()) {
            in.push(out.pop());
        }
        in.push(x);
    }

    public static int pop() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
        return out.pop();
    }

    public static int peek() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
        return out.peek();
    }

    public static boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
