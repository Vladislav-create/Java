package lesson_2;

public class Task_2 {
    public static void main(String[] args) {
        int n = 3;
        findPath(0, n, 1, 2, "");
    }

    private static void findPath(int src, int target, int step1, int step2, String path) {
        if (src > target) return;
        if (src == target) {
            System.out.println(path);
            System.out.println("------------");
            return;
        }
        findPath(src + step1, target, step1, step2, path + src + "+" + step1 + "\n");
        findPath(src + step2, target, step1, step2, path + src + "+" + step2 + "\n");
    }

}
                                    // Решение для LeetCode с семинара:

//class Solution {
//    int [] cache;
//
//    public int climbStairs(int n) {
//        cache = new int [n + 1];
//        cache[0] = 1;
//        cache[1] =1;
//
//        helper(n);
//        return cache[n];
//    }
//
//    private int helper(int n) {
//        if (cache[n] != 0) {
//            return cache[n];
//        }
//
//        cache[n] = helper(n-1) + helper(n-2);
//        return cache[n];
//    }
//}