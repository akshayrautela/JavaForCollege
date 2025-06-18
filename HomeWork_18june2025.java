
import java.util.*;

public class HomeWork_19june2025.java {

    public static Scanner sc = new Scanner(System.in);

    public static int[] input() {
        System.out.print("Enter The Elements of an Array ( followed by Spaces ) : ");
        String st = sc.nextLine();
        String[] str = st.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }
    public static String[] inputstring() {
        System.out.print("Enter The Password to an Array ( followed by Spaces ) : ");
        String st = sc.nextLine();
        String[] str = st.split(" ");
        return str;
    }


    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void displayString(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void primeArray() {
        int[] arr = input();
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("All Prime");
        } else {
            System.out.println("All Not Prime");
        }

    }

    public static void rotateArray() {
        int[] arr = input();
        System.out.print("Enter the Rotating Index : ");
        int index = sc.nextInt();
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        display(arr);
    }

    public static void palindromeArray() {
        int[] arr = input();
        int j = arr.length - 1;
        boolean flag = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[j]) {
                flag = false;
            }
            j--;
        }
        if (flag) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array isn't Palindrome");
        }
    }

    public static void nonReoccuringCombination() {
        int[] arr = input();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i != j && j != k && k != i) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " ");
                    }
                }
            }
        }
    }
    public static void swapAdjacentElements(){
        int [] arr = input();
        for(int i=0;i<arr.length-1;i++){
            if(i%2 == 0){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        display(arr);
    }
    public static void swapFashion(){
        int [] arr = input();
        int [] raa = input();
        int j =0;
        for(int i=0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = raa[j+1];
            raa[j+1] = temp;
            int temp2 = raa[j];
            raa[j] = arr[i+1];
            arr[i+1] = temp2;

            j+=2;
        }
        display(arr);
        System.out.println();
        display(raa);
    }
    public static void uniqueElement(){
        int [] arr = input();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1] - arr[i] != 1){
                System.out.println("The Missing Element here is "+ (arr[i+1] - 1));
            }
        }
    } 
    public static void removeDuplicate(){
        int [] arr = input();
        int [] ar = new int [arr.length];
        int k =0;
        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    flag = false;
                    break;
                }     
            }
            if(flag){
                ar[k++] = arr[i];
            }
        }
        display(ar);
    }
    public static void evenOddArray(){
        int[] arr = input();
        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];
        int k=0; int l=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                even[k++] =arr[i];
            }else{
                odd[l++] = arr[i];
            }
        }
        display(even);
        System.out.println();
        display(odd);
    }
    public static void passwordChecker(){
        String [] original = {"S","P","A","C","E"};
        String[] str = inputstring();
        Boolean flag = true;
        for(int i=0;i<str.length;i++){
            if(!str[i].equals(original[i])){
                flag = false;
            }
        }
        if(flag){
            System.out.println("Password is Correct");
        }else{
            System.out.println("Password is inCorrect ");
        }

    }
    public static void main(String[] args) {
        passwordChecker();
    }
}
