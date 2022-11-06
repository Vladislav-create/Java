package lesson_2;

public class Task_1 {
    public static void main(String[] args) {
        double num = 2.00000;
        int pow = -2147483648;
        System.out.println(TestPow(num, pow));
    }
    static double TestPow(double x, int y) {
        double sum = Math.pow(x,y);
        return sum;
    }
}