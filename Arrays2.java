import java.util.*;

public class Arrays2 {
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

    public static void bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= n - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            n -= i;

        }
        display(arr);
    }

    public static void selection_Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            int smallPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallPos]) {
                    smallPos = j;
                }
            }
            int temp = arr[smallPos];
            arr[smallPos] = arr[i];
            arr[i] = temp;
        }
        display(arr);
    }

    public static void insertion_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        display(arr);
    }

    public static void main(String[] args) {
        insertion_sort(input());

    }

}
