import java.util.*;

public class patternadv {
    public static Scanner sc = new Scanner(System.in);

    // Useful function to convert String to numbers
    public static int[] stringToNum() {
        System.out.print("Enter The Rows and Column : ");
        String st = sc.nextLine();
        String[] starr = st.split(" ");
        int[] arr = new int[starr.length];
        for (int i = 0; i < starr.length; i++) {
            arr[i] = Integer.parseInt(starr[i]);
        }
        return arr;
    }

    public static void hollowrectangle() {
        int[] arr = stringToNum();
        int rw = arr[0];
        int cl = arr[1];
        for (int r = 1; r <= rw; r++) {
            for (int c = 1; c <= cl; c++) {
                if (r == 1 || r == rw || c == 1 || c == cl) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid() {
        // Inverted and Rotated
        int[] arr = stringToNum();
        int rw = arr[0];
        int cl = arr[1];
        for (int i = 1; i <= rw; i++) {
            for (int j = cl; j >= 1; j--) {
                if (i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void numberPyramid() {
        // Inverted Half Number Pyramid
        int[] arr = stringToNum();
        int rw = arr[0];
        int cl = arr[1];
        for (int i = arr[0]; i > 0; i--) {
            for (int j = 1; j <= arr[1]; j++) {
                if (i >= j) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void floydsTriangle() {
        int[] arr = stringToNum();
        int rw = arr[0];
        int cl = arr[1];
        // Logic
        int flag = 0;
        for (int i = 1; i <= rw; i++) {
            for (int j = 1; j <= cl; j++) {
                if (i >= j) {
                    flag++;
                    System.out.print(flag);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void zerOneTriangle() {
        int[] arr = stringToNum();
        int rw = arr[0];
        int cl = arr[1];
        boolean flag = true;

        for (int i = 0; i <= rw; i++) {
            for (int j = 0; j <= cl; j++) {
                if (i >= j) {
                    System.out.print(flag ? 1 : 0);
                    flag = !flag;
                } else {
                    if (i % 2 != 0) {
                        flag = !flag;
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly() {
        int[] arr = stringToNum();
        int rw = arr[0];
        int cl = arr[1];
        // int rw = 4;
        // int cl = rw;
        for (int i = 0; i <= rw; i++) {
            for (int j = 0; j <= cl; j++) {
                if (i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            for (int k = cl; k >= 0; k--) {
                if (i >= k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        
            System.out.println();
        }
        for (int i = rw*2; i >= rw+1; i--) {
            for (int l = cl; l <= cl*2; l++) {
                if (i >= l) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int m = cl*2; m >= cl; m--) {
                if (i >= m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }


            System.out.println();
        }
       
    }

    public static void main(String[] args) {
        butterfly();

    }

}
