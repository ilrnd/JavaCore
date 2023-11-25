package org.example.regular;

public class Mathematics {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        int div = -1;
        try {
            div = a / b;
        } catch (ArithmeticException e){
            System.out.println("Делить на 0 нельзя");
        }
        return div;
    }
}
