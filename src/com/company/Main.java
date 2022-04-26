package com.company;

public class Main {

    public static double divide(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(20, 5));
            System.out.println(divide(5, 0));
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}
