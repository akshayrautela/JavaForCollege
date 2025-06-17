import java.util.*;

public class Arrays {
    public static Scanner sc = new Scanner(System.in);

    public static void creation() {
        System.out.print("Enter The Length of Array :");
        int lengthOfArray = sc.nextInt();
        int[] arr = new int[lengthOfArray];
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr3; // Declare an Array
        arr3 = new int[] { 10, 11, 12, 13 }; // Initialize the Array
    }

    public static void inputOutputAndUpdate() {
        System.out.print("Enter the Length of Array : ");
        int l = sc.nextInt();
        int[] myarr = new int[l]; // Input
        for (int i = 0; i < l; i++) {
            myarr[i] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) { // output
            System.out.print(myarr[i] + " ");
        }
        int[] arr;
        arr = new int[] { 86, 97, 12, 42 };
        int sum = 0;
        for (int i = 0; i < l; i++) { // Updation
            sum += arr[i];
        }
        float percentage = (float) sum / l;
        System.out.println(percentage + "%");
    }

    public static void printfunc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void pass_As_Reference(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 20) {
                int digit = (int) Math.log10(arr[i]);
                int divisor = (int) (Math.pow(10, digit));
                arr[i] = (arr[i] / divisor) + 10;
            }
        }
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int smallestElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] sorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }
        return arr;
    }

    public static int binarySearch_first(int[] arr, int key) {
        // For Sorted Array
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == key) {
                first = mid;
                end = mid -1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            }

        }

        return first;
    }
    public static int binarySearch_last(int[] arr, int key) {
        // For Sorted Array
        int start = 0;
        int end = arr.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == key) {
                last = mid;
                start = mid + 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            }

        }

        return last;
    }
    public static int[] reverse_of_an_array(int[] arr){
        int end = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
                int temp = arr[i];
                arr[i]=arr[end];
                arr[end] = temp;
                end --;
        }
        return arr;
    }
    public static int[] reverse_of_an_array2(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
        return arr;
    }

public static void frequencyOfElements(int[] arr) {
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println("Element: " + arr[i] + " -> Frequency: " + count);
        }
    }



    public static void main(String[] args) {
        int[] marks = { 14, 13, 6021, 51, 61, 12, 601 };
        pass_As_Reference(marks); // Actual value of code is changed
        int found = linearSearch(marks, 16);
        if (found != -1) {
            System.out.println("The Element is at Index " + found);
        } else {
            System.out.println("There ain't such element in the array");
        }
        System.out.println("The Largest Element in this array is : " + largestElement(marks)
                + " \nAnd the Smallest value of the Array is " + smallestElement(marks));
        printfunc(marks);

        System.out.println();
        printfunc(sorted(marks));
        int result = binarySearch_last(marks, 16) - binarySearch_first(marks, 16)+1;
        if (result != -1) {
            System.out.println("The Element is repeating " + result+" Times");
        } else {
            System.out.println("There ain't such element in the array");
        }
        int [] arr = {1,2,3,4,5,6};
            reverse_of_an_array2(arr);
            printfunc(arr);
frequencyOfElements(marks);

    }
}
