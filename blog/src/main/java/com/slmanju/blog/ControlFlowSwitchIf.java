package com.slmanju.blog;

public class ControlFlowSwitchIf {

    public static void main(String[] args) {
        dayOfWeek(3);
        printType(124);
    }

    private static void printType(int number) {
        if (number < 0) {
            System.out.println("Negative number");
        } else if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Positive odd number");
        }
    }

    private static void dayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

}
