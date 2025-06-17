import java.util.*;

public class Day5 {
    public static void pattern1() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern3() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4() {
        for (int i = 1; i < 5; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j < 6; j++) {
                    System.out.print("# ");
                }
            } else {
                for (int j = 1; j < 6; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }

    public static void pattern5() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 6; j++) {
                if (j % 2 == 0) {
                    System.out.print("# ");
                } else {

                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern6() {
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 10; j++) {
                if (j % 2 != 0) {
                    System.out.print(j);
                }
            }
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                if (j % 2 == 0) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void pattern7() {
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern8() {
        int flag = 97;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    System.out.print((char) (flag + i));
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pattern9() {
        int flag = 97;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print((char) (flag + i));
            }
            System.out.println();
        }
    }

    public static void pattern10() {
        for (int j = 1; j < 10; j++) {
            System.out.print(j);
            if (j % 3 == 0) {
                System.out.println();
            }
        }
    }

    public static void pattern11() {
        int flag = 100;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (j > 0) {
                    System.out.print("*");

                } else {
                    System.out.print((char) (flag - i));
                }
            }
            System.out.println();
        }
    }

    public static void pattern12() {
        int num = 0;
        int flag = 97;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (i % 2 != 0) {
                    System.out.print(num);
                } else {
                    System.out.print((char) (flag));
                }
            }
            if (i % 2 == 0) {
                num++;
            } else {

                flag = (char) (flag + 1);
            }
            System.out.println();
        }
    }

    public static void pattern13() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
                if (j >= i) {
                    break;
                }
            }
            System.out.println();
        }
    }

    public static void pattern14() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j);
                if (j > i) {
                    break;
                }
            }
            System.out.println();
        }
    }

    public static void pattern15() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > 0; j--) {
                System.out.print(j);
                if (j == i) {
                    break;
                }
            }
            System.out.println();
        }
    }

    public static void pattern16() {
        char flag = 'a';
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print(flag);

                }
            }
            System.out.println();
            flag = (char) (flag + 1);
        }
    }

    public static void pattern17() {
        char flag = '*';
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print(flag);

                }
            }
            System.out.println();
            if (flag == '*') {
                flag = '#';
            } else {
                flag = '*';
            }
        }
    }

    public static void pattern18() {
        int flag = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i >= j) {
                    System.out.print(flag);
                    flag++;
                }
            }
            System.out.println();

        }
    }

    public static void pattern19() {
        char flag = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print(flag);
                }
            }
            System.out.print(i);
            System.out.println();
            flag = (char) (flag + 1);
        }
    }

    public static void pattern20() {
        char flag = 'C';
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print(flag);
                }
            }
            System.out.println();
            flag = (char) (flag + 1);
        }
    }

    public static void pattern21() {
        int num = 1;
        char flag = 'e';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print(num);
                    num++;
                }
            }
            num = 1;
            System.out.print(flag);
            System.out.println();
            flag = (char) (flag - 1);
        }
    }

    public static void pattern22() {
        int num = 1;
        char flag = 'a';
        for (int i = 1; i <= 5; i++) {
            System.out.print(flag);
            for (int j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print(num);

                }
            }
            num++;
            System.out.println();
            flag = (char) (flag + 1);
        }
    }

    public static void pattern23() {
        char flag = 'a';
        for (int i = 1; i <= 5; i++) {
            char curr;
            if (i % 2 == 0) {
                curr = (char) (flag - 32);
            } else {
                curr = flag;
            }
            for (int j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print(curr + " ");
                }
                // flag = (char)(flag+2);
            }

            System.out.println();
            flag += 2;
        }
    }

    public static void pattern24() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 0; i--) {
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern25() {
        int num = 1;
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            num = 1;
            System.out.println();
        }
        for (int i = 2; i >= 0; i--) {
            for (int k = 0; k <= i; k++) {
                System.out.print(num);
                num++;
            }
            num = 1;
            System.out.println();
        }
    }

    public static void pattern26() {
        char num = 'a';
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            num = 'a';
            System.out.println();
        }
        for (int i = 3; i >= 0; i--) {
            for (int k = 0; k <= i; k++) {
                System.out.print(num);
                num++;
            }
            num = 'a';
            System.out.println();
        }
    }

    public static void pattern27() {
        int num = 5;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num--;
            }
            num = 5;
            System.out.println();
        }
        for (int i = 3; i >= 0; i--) {
            for (int k = 0; k <= i; k++) {
                System.out.print(num);
                num--;
            }
            num = 5;
            System.out.println();
        }
    }

    public static void pattern28() {
        int num = 5;
        for (int i = 5; i >= 0; i--) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num--;
            }

            num = 5;
        }
        for (int i = 1; i <= 4; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(num);
                num--;
            }
            num = 5;
            System.out.println();
        }
    }

    public static void pattern29() {
        char num = 'A';
        for (int i = 4; i >= 0; i--) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }

            num = 'A';
        }
        for (int i = 1; i <= 4; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(num);
                num++;
            }
            num = 'A';
            System.out.println();
        }
    }

    public static void pattern30() {
        int num = 1;
        char ch = 'a';
        for (int i = 6; i > 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
        for (int i = 5; i > 1; i--) {
            for (int k = 0; k <= i; k++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    public static void pattern31() {
        char ch = 'a';
        for (int i = 1; i <= 4; i++) {
            char curr;
            for (int j = 1; j <= i; j++) {
                curr = ch;
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print(curr);
                        curr = ch++;
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(curr);
                        curr = ch++;
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern31();
    }
}
