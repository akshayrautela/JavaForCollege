import java.util.*;

public class Matrices {
    public static Scanner sc = new Scanner(System.in);

    public static int[][] create() {
        System.out.print("Enter the n & m of matrix (Followed by spaces) : ");
        String str = sc.nextLine();
        String[] st = str.split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        int[][] arr = new int[n][m];
        // Input
        //int[][] arr = new int[5][5];
        System.out.print("Enter 9 elements followed by spaces : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public static void display(int[][] arr) {
        System.out.print("\n ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("|\n ");
        }
    }

    public static void findKey(int[][] arr, int key) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("The elemenet is at Index : ( " + i + " , " + j + " )");
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("Element not found");
        }
    }

    public static void max_min_elements(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                } else if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(
                "The Maximun Element in The Matrix is " + max + "\nThe Minimun Elelment in the Matrix is " + min);
    }

    public static void spiral(int[][] arr) {
        // int r = 0;
        // int c = 0;
        int bottom = arr.length - 1;
        int right = arr[0].length - 1;
        int top = 0;
        int left = 0;
        while (top <= bottom && left <= right) {
            // left to right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // right to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void diagonal_sum(int[][] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][i];
            System.out.print(arr[i][i] + " ");
            if(i!= n-i-1){
                sum+=arr[i][n-i-1];
                System.out.print(arr[i][n-i-1] + " ");
            }
        }
            System.out.println("The Sum of Diagonals are "+(sum));
      
    }
public static void binarySearch(int[][] arr ,int key){
   int bottom=arr[0].length-1;
    while(bottom>=0){
         int s=0;int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[bottom][mid] == key){
                System.out.println("found at :"+bottom+", "+mid);
                break;
            }else if(arr[bottom][mid]<key){
                s=mid+1;
            }else if(arr[bottom][mid]>key){
                e=mid-1;
            }
        }
        bottom--;
    }
    
}
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },{ 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        display(arr);
        binarySearch(arr,2);
        //diagonal_sum(create());
        // max_min_elements(create());
    }
}
