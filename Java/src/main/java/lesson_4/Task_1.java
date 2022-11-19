package lesson_4;

import java.util.*;

// 20. Valid Parentheses
public class Task_1 {


    public static void main(String[] args) {
        String str = "()";
        System.out.println(isValid(str));

        str = "()[]{}";
        System.out.println(isValid(str));

        str = "(]";
        System.out.println(isValid(str));

        str = "([)]";
        System.out.println(isValid(str));

        str = "[()]";
        System.out.println(isValid(str));

        str = "]()]";
        System.out.println(isValid(str));

        str = "[[";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (Character curCh : s.toCharArray()) {
            if (curCh == '(' || curCh == '[' || curCh == '{') {
                stack.push(curCh);
            } else if (!stack.empty()) {
                char ch = stack.peek();
                if ((curCh == ')' && ch == '(') || (curCh == '}' && ch == '{') || (curCh == ']' && ch == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }
}


//        Stack<Integer> stack = new Stack<>();
//
//        System.out.println(stack.isEmpty());
//
//        stack.push(5);
//        stack.push(12);
//        stack.push(65);
//
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack);
//        System.out.println(stack.size());
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.size());
//
//        Queue<Integer> qu = new LinkedList<>();
//
//        qu.add(4);
//        qu.add(10);
//        qu.add(20);
//        System.out.println(qu.peek());
//        System.out.println(qu.poll());
//        System.out.println(qu);
//
//        String s = "()";
//        for (char el : s.toCharArray()) {
//            System.out.println(el);
//        }
//        char [] charString = s.toCharArray();
//        System.out.println(charString);
//
//        for (char item : charString) {
//            System.out.println(item);
//        }
//        System.out.println("-------------");
//        System.out.println(charString[5]);
//    }
//}
//    List<Integer> expList = new ArrayList<>();
//
//    static void foo(){
//        expList.add(5);
//        expList.add(60);
//
//    }
//
//    public void iterFoo() {
//        for (el : expList) {
//            System.out.println(el);
//        }
//    }
//}