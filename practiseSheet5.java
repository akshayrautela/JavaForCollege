import java.util.*;

public class practiseSheet5 {
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

    public static void Q1(int[] arr) {
        // swap_firstAndLast
        int index = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            index--;
        }
        display(arr);
    }

    public static void Q2(int[] arr) {
        // o input an array and find the second largest element in the array
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                // sec=max;
                max = arr[i];
            } else if (arr[i] > sec && arr[i] != max) {
                sec = arr[i];
            }
        }
        System.out.println("The Second Largest Element of Array is " + sec);
    }

    public static void Q3(int[] arr) {
        // input an array and shift all zeros to the left side of the array while
        // shifting all non-zero elements to the right side
        int n = arr.length;
        int index = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;
            }
        }
        while(index>=0){
            arr[index] = 0;
            index--;
        }

        display(arr);
    }

    

    public static void main(String[] args) {
        // Q1(input());
        Q3(input());
    }
}