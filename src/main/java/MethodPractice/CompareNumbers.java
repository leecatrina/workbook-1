package MethodPractice;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isEven(10));

        System.out.println(isPositive(0.3));
        System.out.println(isPositive(4.7));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPositive(double number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
}

