package lesson_4;

import java.util.HashMap;
import java.util.Map;

// 1021. Remove Outermost Parentheses
public class Task_4 {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));

        s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));

        s = "()()";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        Character serchItem = '(';
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (Character item : s.toCharArray()) {
            if (item == serchItem) {
                map.putIfAbsent(item, 0);
                map.put(item, map.get(item) + 1);
                if (map.get(serchItem) > 1) {
                    result.append(item);
                }
            } else {
                map.put(serchItem, map.get(serchItem) - 1);
                if (map.get(serchItem) >= 1) {
                    result.append(item);
                }
            }

        }
        return result.toString();
    }
}