import java.util.*;

public class Day2 {
    public static Scanner sc = new Scanner(System.in);

    public static void check_buzz() {
        int num = sc.nextInt();
        // Buzz Number
        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println("No is buzz");
        } else {
            System.out.println("No. is not buzz");
        }
    }

    public static void calc() {

        System.out.println("Enter the first Number");

        int a = sc.nextInt();
        System.out.println("Enter the Second Number");

        int b = sc.nextInt();
        // If-else statements
        System.out.println(
                "Type 1 for addition\nType 2 for Sub\nType3 for division\nType 4 for Multiplication\nType 5 for Modulo");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Result is = " + (a + b));
        }
        if (n == 2) {
            System.out.println("Result is = " + (a - b));
        }
        if (n == 3) {
            System.out.println("Result is = " + (a * b));
        }
        if (n == 4) {
            System.out.println("Result is = " + (a / b));
        }
        if (n == 5) {
            System.out.println("Result is = " + (a % b));
        }
    }

    public static void Q24() {
        // Case Toggle
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);
        char result;
        if (ch >= 'A' && ch <= 'Z') {
            result = (char) (ch + 32);
            System.out.println("Outcome will be " + result);
        }
        if (ch >= 'a' && ch <= 'z') {
            result = (char) (ch - 32);
            System.out.println("Outcome will be " + result);
        }
    }

    public static void Q23() {
        System.out.println("enter the no");
        int num = sc.nextInt();
        int first = ((num % 10) % 10);
        int second = (num / 10 % 10);
        if (first % 2 == 0 && second % 2 == 0 && num % 2 == 0) {
            System.out.println("The Number " + num + " is even");
        }
        if (first % 2 != 0 || second % 2 != 0 || num % 2 != 0) {
            System.out.println("The Number " + num + " is odd");
        }
    }

    public static void Q16() {
        System.out.print("Check for even/odd No using Switch Case\nEnter the No. : ");
        int num = sc.nextInt();
        int check = num % 2;
        switch (check) {
            case 0:
                System.out.println("No is even");
                break;
            case 1:
                System.out.println("No is odd");
                break;
        }
    }
    public static void main(String[] args) {
        Q16();

    }
}