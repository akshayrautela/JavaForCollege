

import java.util.*;

public class Practise_Sheet_2 {
    public static Scanner sc = new Scanner(System.in);

    public static void check_even_odd() {
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even");
        } else {
            System.out.println("The number " + num + " is Odd");
        }
    }

    public static void Q2() {
        // program to check weather a number is divisible by 2 and 5
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 2 == 0) {
            System.out.println("The Number " + n + " is divisible by 2 & 5 ");
        } else {
            System.out.println("The Number is not divisible by 2 & 5");
        }
    }

    public static void Q3() {
        int num = sc.nextInt();
        // Buzz Number
        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println("No is buzz");
        } else {
            System.out.println("No. is not buzz");
        }
    }

    public static void Q4() {
        // program to check weather a number is divisible by 5 or Not
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("The Number " + n + " is divisible by 5 ");
        } else {
            System.out.println("The Number is not divisible by 5");
        }
    }

    public static void Q5() {
        // program to check weather a character is vowel or consonant?
        char entry = sc.next().charAt(0);
        switch (entry) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Input Entry is Vowel");
                break;
            default:
                System.out.println("Input Entry is Consonent");

        }

    }

    public static void checkvowel() {
        System.out.print("Enter the Character Input : ");
        char entry = sc.next().toLowerCase().charAt(0);
        if (!Character.isLetter(entry)) {
            System.out.println("Is not a Valid Character Input");
            return;
        }
        char[] arr = { 'a', 'e', 'i', 'o', 'u' };
        boolean isvalid = false;
        // Main Logic
        for (char i : arr) {
            if (i == entry) {
                isvalid = true;
                break;
            }
        }
        if (isvalid) {
            System.out.println("Input Entry is a vowel");
        } else {
            System.out.println("Input Entry is a consonent");
        }

    }

    public static void Q6() {
        // program to check weather a character is vowel, consonant, number or special
        // character
        System.out.print("Enter any Input (vowel , consonent , number , special character) : ");
        char ch = sc.next().charAt(0);
        // Upper Case to Lower Case
        if ((ch >= 'A' && ch <= 'Z') || ch >= 'a' && ch <= 'z') {
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Input is a Vowel");
            } else {
                System.out.println("Input is a Consonent");
            }
        }

        if (ch >= '0' && ch <= '9') {
            System.out.println("Input Entry is a Digit");
        } else {
            System.out.println("Input Entry is a Special Character");
        }
    }

    public static void Q7() {
        // program to check weather a year is a leap year or not?
        System.out.print("Enter a Year : ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("The year is a Leap Year");
        } else {
            System.out.println("not a leap year");
        }
    }

    public static void Q8() {
        // program to check weather a number is negative or positive or not?
        System.out.print("Enter a Number : ");
        String num = sc.next();
        String zero = "0";
        try {
            int isnum = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("Input Entry is not a Number");
        }
        if (num.compareTo(zero) >= 0) {
            System.out.println("The input is positive");
        } else {
            System.out.println("The Input is negative");
        }
    }

    public static void Q9() {
        // a program to check weather a person can vote or not?
        System.out.print("Enter the Age of this Person : ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You Can Vote");
        } else {
            System.out.println("you can't vote");
        }

    }

    public static void Q10() {
        // program to check weather a person is teenager or not?
        System.out.print("Enter the Age of this Person : ");
        int age = sc.nextInt();
        if (age >= 13 && age <= 19) {
            System.out.println("This person is a Teenager");
        } else {
            System.out.println("This person is not a teen");
        }
    }

    public static void Q11() {
        // a program to take age as an input and check the following:(0-12) Kid(13-19)
        // Teenager(20-60) Adult(61-100) Old(100>) Not defined
        System.out.print("Enter the Age of this Person : ");
        int age = sc.nextInt();
        if (age >= 0 && age <= 100) {
            if (age >= 0 && age <= 12) {
                System.out.println("This person is a Kid");
            } else if (age >= 13 && age <= 19) {
                System.out.println("This person is a Teenager ");

            } else if (age >= 20 && age <= 60) {
                System.out.println("This person is a Adult ");

            } else if (age >= 61 && age <= 100) {
                System.out.println("This person is Old ");

            }
        } else {
            System.out.println("This Person is not define");
        }
    }

    public static void Q12() {
        // check weather a number is single digit double digit or triple digit or not?
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int count = 0;
        // absolute value of this number
        int absnum = Math.abs(num);
        // Main Logic of this Programm
        if (absnum == 0) {
            count = 1;
        } else {
            while (absnum > 0) {
                absnum = absnum / 10;
                count++;
            }
        }
        System.out.println(absnum);
        // check for count
        if (count == 1) {
            System.out.println("It is a Single Digit Number");
        } else if (count == 2) {
            System.out.println("It is a Double Digit Number");
        } else if (count == 3) {
            System.out.println("It is a Triple Digit Number");
        } else {
            System.out.println("More than Three Digit Number");
        }

    }

    public static void digitchecker() {
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int absnum = Math.abs(num);
        // Ternary Operator
        int count = absnum == 0 ? 1 : (int) Math.log10(absnum) + 1;
        System.out.println("The Number of digit in " + num + " is " + count);
    }

    public static void Q13() {
        // a program to input three numbers and check which number is greatest among
        // three numbers?

        System.out.print("Enter Three Number Followed by a space to Check Which one is the Greatest : ");
        // Input a String of elements which forms an array seperated by a space
        String inpt = sc.nextLine();
        // Splits the String into String Array through spaces
        String[] split = inpt.split("\\s+");
        int[] arr = new int[split.length];
        // Converts each elements of String array into Integer Array
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > arr[j + 1] && arr[j] > arr[j + 2]) {
                System.out.println(arr[j] + " IS THE greatest");
                break;
            } else if (arr[j + 1] > arr[j] && arr[j + 1] > arr[j + 2]) {
                System.out.println(arr[j + 1] + " IS THE greatest");
                break;
            } else {
                System.out.println(arr[j + 2] + " IS THE greatest");
                break;
            }
        }
    }

    public static void Q14() {
        // a program to check weather a character is vowel or consonant.
        String sent = sc.nextLine();

        for (int i = 0; i < sent.length(); i++) {
            // break the string from spaces and put them into char variable name ch which
            // iterates in every turn
            char ch = sent.charAt(i);
            // Cecking if the input Sring is actually a Letter or not
            if (Character.isLetter(ch)) {
                // Converts the Letter into Lower Case Scenerio
                char lw = Character.toLowerCase(ch);
                // Main Logic
                if (lw == 'a' || lw == 'e' || lw == 'i' || lw == 'o' || lw == 'u') {
                    System.out.println("The Letter " + ch + " is a Vowel");
                } else {
                    System.out.println("The Letter " + ch + " is a Consonent");

                }
            }
        }
    }

    public static void Q15() {
        // program to find maximum between two numbers using switch case.
        System.out.print("Enter Two No. : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int flag;
        if (n1 > n2) {
            flag = 1;
        } else if (n2 > n1) {
            flag = 2;
        } else {
            flag = -1;
        }
        switch (flag) {
            case 1:
                System.out.println("n1 is Greater than n2");
                break;
            case 2:
                System.out.println("n2 is Greater than n1");
                break;
            case -1:
                System.out.println("Both No. are of Same value");
        }
    }

    public static void Q16() {
        // program to check whether a number is even or odd using switch case.
        System.out.print("Enter A No. : ");
        int n = sc.nextInt();
        int flag;
        if (n % 2 == 0) {
            flag = 1;
        } else {
            flag = 0;
        }
        switch (flag) {
            case 1:
                System.out.println("The NO. " + n + " is Even");
                break;
            case 0:
                System.out.println("The NO. " + n + " is Odd");
                break;
        }

    }

    public static void Q17() {
        // program to print day of week name using switch case.
        System.out.print("Enter day of week :  ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a Valid No.");
        }
    }

    public static void Q18() {
        // program to check whether a number is positive, negative or zero using switch
        // case
        System.out.print("Enter A No. : ");
        int n = sc.nextInt();
        String flag = "null";
        if (n > 0) {
            flag = "Positive";
        } else if (n < 0) {
            flag = "Negative";
        } else if (n == 0) {
            flag = "Zero";
        }

        switch (flag) {
            case "Positive":
                System.out.println(flag);
                break;
            case "Negative":
                System.out.println(flag);
                break;
            case "Zero":
                System.out.println(flag);
                break;
            default:
                System.out.println("Enter a valid Number");

        }
    }

    public static void Q19() {
        // program to create Simple Calculator using switch case.
        System.out.print("Enter The Expression of the Calc : ");
        String st = sc.nextLine();
        String o1 = "", o2 = "";
        char op = ' ';
        boolean found = false;

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (Character.isDigit(ch)) {
                if (!found) {
                    o1 = o1 + ch;
                } else {
                    o2 = o2 + ch;
                }
            } else {
                op = ch;
                found = true;
            }
            ;
        }

        int op1 = Integer.parseInt(o1);
        int op2 = Integer.parseInt(o2);

        switch (op) {
            case '+':
                System.out.println(op1 + "+" + op2 + "=" + (op1 + op2));
                break;
            case '-':
                System.out.println(op1 + "-" + op2 + "=" + (op1 - op2));
                break;
            case '*':
                System.out.println(op1 + "*" + op2 + "=" + (op1 * op2));
                break;
            case '/':
                System.out.println(op1 + "/" + op2 + "=" + (op1 / op2));
                break;
            case '%':
                System.out.println(op1 + "%" + op2 + "=" + (op1 % op2));
                break;
            default:
                System.out.println("Enter a Valid Operand");
        }
    }

    public static void Q20() {
        // program to print total number of days in a month using switch case
        System.out.print("Enter The Month : ");
        String month = sc.nextLine();
        System.out.print("Enter the Year : ");
        int year = sc.nextInt();
        String lower = "";
        for (int i = 0; i < month.length(); i++) {
            char ch = month.charAt(i);
            if (ch > 'A' && ch < 'Z') {
                ch += 32;
            }
            lower = lower + ch;
        }
        switch (lower) {
            case "januray":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("The Month " + month + " has " + 31 + " Days");
                break;
            case "febuary":
                if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
                    System.out.println("The Month " + month + " has " + 29 + " Days");
                    break;
                } else {
                    System.out.println("The Month " + month + " has " + 28 + " Days");
                }
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("The Month " + month + " has " + 30 + " Days");
                break;
            default:
                System.out.println("Enter a valid Month Name ");
        }
    }

    public static void Q21() {
        // program to input a digit between 0 to 9 and print the digit name
        System.out.println("Enter a Digit name (Between 0 & 9) : ");
        int dg = sc.nextInt();
        String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
        if (dg >= 0 && dg <= 9) {
            System.out.println(arr[dg]);
        } else {
            System.out.println("Enter a Valid Input");
        }
    }

    public static void Q22() {
        //program to input three integers representing the sides of a triangle and classify the triangle as:Equilateral (all sides equal)Isosceles (any two sides equal) Scalene (no sides equal)

        System.out.print("Enter the three Sides of a Triangle using space in between : ");
        String sd = sc.nextLine();
        String[] arr = sd.split(" ");

        int[] ar = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ar[i] = Integer.parseInt(arr[i]);
        }
 
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == ar[i+1] && ar[i] == ar[i+2]){
                System.out.println("The Input Triangle is an Equilateral Triangle");
                break;
            }else if(ar[i] == ar[i+1] || ar[i+1] == ar[i+2] || ar[i] == ar[i+2]){
                System.out.println("The Input Triangle is an Isosceles Triangle");
                break;
            }else{
                System.out.println("The Input Triangle is an Scalene Triangle");
                break;
            }
        }
    }

    public static void main(String args[]) {
        Q22();
    }
}