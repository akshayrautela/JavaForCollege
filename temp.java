
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        //
        // Ndigitalchecker();
        // NDigitChecker();
        // splitString(sc.nextLine());
        tt();
    }

    public static void tt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Rows and Column : ");
        String st = sc.nextLine();
        String[] starr = st.split(" ");
        int[] arr = new int[starr.length];
        for (int i = 0; i < starr.length; i++) {
            arr[i] = Integer.parseInt(starr[i]);
        }
    }

    public static void splitString(String input) {
        String num1 = "", num2 = "";
        char operator = ' ';
        boolean foundOperator = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                if (!foundOperator) {
                    num1 += ch;
                } else {
                    num2 += ch;
                }
            }

            else {
                operator = ch;
                foundOperator = true;
            }

        }

        // Convert strings to integers
        int operand1 = Integer.parseInt(num1);
        int operand2 = Integer.parseInt(num2);

        // Print results
        System.out.println("Operand 1: " + operand1);
        System.out.println("Operator : " + operator);
        System.out.println("Operand 2: " + operand2);
    }

    public static void Ndigitalchecker() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Handle negative numbers
        int absNum = Math.abs(num);

        if (absNum < 10) {
            System.out.println("It is a SINGLE DIGIT number.");
        } else if (absNum < 100) {
            System.out.println("It is a DOUBLE DIGIT number.");
        } else if (absNum < 1000) {
            System.out.println("It is a TRIPLE DIGIT number.");
        } else {
            System.out.println("It is MORE THAN THREE DIGITS.");
        }
    }

    public static void NDigitChecker() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int absNum = Math.abs(num);

        int digitCount = (absNum == 0) ? 1 : (int) Math.log10(absNum) + 1;

        System.out.println("It is a " + digitCount + "-digit number.");
    }

    public static void anotherone() {
        int number = 756; // you can change this value to test other numbers
        int count = 0;
        int temp = number;

        // Make number positive if it's negative
        if (temp < 0) {
            temp = -temp;
        }

        // Special case: 0 has 1 digit
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
        }

        // Output based on digit count
        if (count == 1) {
            System.out.println("Single digit number");
        } else if (count == 2) {
            System.out.println("Double digit number");
        } else if (count == 3) {
            System.out.println("Triple digit number");
        } else {
            System.out.println("More than three digits");
        }
    }

}
