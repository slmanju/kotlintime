package com.slmanju.blog;

public class ControlFlow {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        findMax(a, b);
        findMax2(a, b);
    }

    private static void findMax2(int a, int b) {
        String result = (a > b) ?  a + " is greater than " + b : b + "is greater than " + a;
        System.out.println(result);
    }

    private static void findMax(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("Max value is " + max);
    }

}
