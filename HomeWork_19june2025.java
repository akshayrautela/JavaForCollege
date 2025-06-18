import java.util.*;

public class HomeWork_19june2025 {
    public static Scanner sc = new Scanner(System.in);

    public static void display(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("] ");
    }

    public static int[] input() {
        System.out.print("Enter the Element of Array (followed by spaces) : ");
        String str = sc.nextLine();
        String[] st = str.split(" ");
        int[] arr = new int[st.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st[i]);
        }
        return arr;
    }

    public static void Q1() {
        // /Write a program to input an array and reverse all its elements.
        int[] arr = input();
        int start = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
        }
        display(arr);
    }

    public static void Q2() {
        int[] a = input();
        int[] b = input();
        int[] sum = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i] + b[i];
        }

        display(sum);
    }

    public static void Q3() {
        int[] arr = input();
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }
        System.out.println("Sum of even No. is " + even + "\n & Sum of Odd No. is " + odd);
    }

    public static void Q4() {
        int[] arr = input();
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.println("Total Positive is " + pos + " Total Negative is " + neg + " Total Zero is " + zero);
    }

    public static void Q5() {
        int[] arr = input();
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            if (sum > 50) {
                break;
            } else {
                System.out.print(arr[i] + " ");
            }
            sum += arr[i];
        }
        System.out.println("sum is " + sum);
    }

    public static void Q6() {
        int[] arr = input();
        for (int i = 0; i < arr.length; i++) {
            if (i == 2) {
                continue;
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void Q7() {
        int[] arr = input();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > 0 && arr[j+1]>0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        display(arr);
    }

    public static void main(String[] args) {
        Q7();
    }
}
