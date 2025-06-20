import java.util.*;

public class practiseSheet6 {
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
        int[] ar = input();
        int m = arr.length - ar.length;
        int n = ar.length;
        int index = arr.length - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (arr[i] > ar[j]) {
                arr[index--] = arr[i--];

            } else {
                arr[index--] = ar[j--];

            }
        }
        display(arr);
        while (j >= 0) {
            arr[index] = ar[j];
            j--;
            index--;
        }
        display(arr);
    }

    public static void Q2(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                display(arr);
                return;
            } else {
                arr[i] = 0;
            }
            // only make a new array if Old one have all zero's
            if (arr[0] == 0) {
                int[] newarr = new int[arr.length + 1];
                newarr[0] = 1;
                display(newarr);
            }
        }

    }
    public static void Q3(int[] arr) {
        System.out.print("Enter The Key : ");
        int key = sc.nextInt();
        boolean found = false;
        int start =0; int end= arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == key){
                  System.out.println("The Key is at Index : " + mid);
                  return; 
            }else if(arr[mid]<key){
                start=mid+1;
            }else if(arr[mid]>key){
                end = mid-1;
            }
        }
        if(!found){
             System.out.println("The Key Should be at Index : " + arr.length);
        }
 
    }
    public static void Q4(int[] arr){
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]>profit){
                    profit = arr[j]-arr[i];
                    System.out.print(profit+" ");
                }
            }
        }
        System.out.println("The Max profit earned is "+profit);
    }
    public static void Q4_1(int[] arr){
       int minPrice = Integer.MAX_VALUE;
int maxProfit = 0;

for (int price : arr) {
    if (price < minPrice) {
        minPrice = price; // new buy opportunity
    } else if (price - minPrice > maxProfit) {
        maxProfit = price - minPrice; // update best profit
    }
}

    }

    public static void main(String[] args) {
        Q4(input());
    }
}
