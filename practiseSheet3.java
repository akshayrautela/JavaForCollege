
import java.util.*;

public class practiseSheet3 {
    public static Scanner sc = new Scanner(System.in);

    public static void Q48() {
        // Armstrong number or not?
        System.out.print("Enter a Armstrong Number : ");
        int num = sc.nextInt();
        int temp = num;
        int dgcount = 0;
        while (temp > 0) {
            dgcount++;
            temp /= 10;
        }
        temp = num;
        int result = 0;
        while (temp > 0) {
            int dg = temp % 10;
            result += (int) (Math.pow(dg, dgcount));
            temp /= 10;

        }
        if (num == result) {
            System.out.println("It is Armstrong NO.");
        } else {
            System.out.println("It is not a Armstrong NO.");
        }
    }

    public static void Q49() {
        // number is palindrome number or not?
        System.out.print("Enter a Plaindrome Number : ");
        int num = sc.nextInt();
        int temp = num;
        int result = 0;
        while (temp > 0) {
            int dg = temp % 10;
            result = dg + result * 10;
            temp /= 10;
        }
        if (num == result) {
            System.out.println("It is an Plaindrom No.");
        } else {
            System.out.println("It isn't a Plaindrome No.");
        }
    }

    public static void Q50() {
        // a number is a prime palindrome number or not?
        System.out.print("Enter a Prime Plaindrome Number : ");
        int num = sc.nextInt();
        int temp = num;
        int result = 0;
        while (temp > 0) {
            int dg = temp % 10;
            result = dg + result * 10;
            temp /= 10;
        }
        if (num == result) {
            System.out.print("It is an Plaindrom No.");
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(result); i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.print(" , It is a Prime Plaindrome");
            } else {
                System.out.print(" , But It isn't a Prime Plaindrome No.");
            }
        } else {
            System.out.print("It isn't a Plaindrome No.");
        }
    }

    public static void Q51() {
        // number is a neon number or not?
        System.out.print("Enter the Neon Number : ");
        int neon = sc.nextInt();
        int sqr = (int) Math.pow(neon, 2);
        int result = 0;
        while (sqr > 0) {
            int dg = sqr % 10;
            result += dg;
            sqr /= 10;
        }
        if (result == neon) {
            System.out.println("It is an Neon Number");
        } else {
            System.out.println("It isn't a neon Number");
        }
    }

    public static void Q52() {
        // number is a magic number or not?
        System.out.print("Enter the Magic Number : ");
        int magic = sc.nextInt();
        int tempresult = 0;
        int actualresult = 0;
        int temp = magic;
        while (temp > 0) {
            int dg = temp % 10;
            tempresult += dg;
            temp /= 10;
        }
        while (tempresult > 0) {
            int dg = tempresult % 10;
            actualresult += dg;
            tempresult /= 10;
        }
        if (actualresult == 1) {
            System.out.println("It is a Magic Number");
        } else {
            System.out.println("It isn't a magic Number");
        }
    }

    public static void Q53() {
        // number is a Niven number or not?
        System.out.print("Enter the Naiven Number : ");
        int num = sc.nextInt();
        int result = 0;
        int temp = num;
        while (temp > 0) {
            int dg = temp % 10;
            result += dg;
            temp /= 10;
        }
        if (num % result == 0) {
            System.out.println("It is an Naiven Number");
        } else {
            System.out.println("It isn't a Naiven Number");
        }
    }

    public static void Q54() {
        // number is a happy number or not?
        System.out.print("Enter the Happy Number : ");
        int num = sc.nextInt();
        int result = 0;
        int temp = num;
        boolean flag = true;
        while (flag) {
            while (temp > 0) {
                int dg = temp % 10;
                result += (int) (Math.pow(dg, 2));
                temp /= 10;
            }
            System.out.print(result + " ");
            if (result == 1) {
                flag = false;
                System.out.println("\nIt is a Happy Number :)");
            } else if (result == num) {
                flag = false;
                System.out.println("\nIt isn't a Happy Number");
            }

            temp = result;
            result = 0;
        }
    }

    public static void Q55() {
        // a number is a spy number or not?
        System.out.print("Enter the Spy Number : ");
        int num = sc.nextInt();
        int sum_result = 0;
        int mul_result = 1;
        int temp = num;
        while (temp > 0) {
            int dg = temp % 10;
            sum_result += dg;
            mul_result *= dg;
            temp /= 10;
        }
        if (sum_result == mul_result) {
            System.out.println("It is an Spy Number ");
        } else {
            System.out.println("It isn't a Spy Number");
        }
    }

    public static void Q56() {
        // a number is a duck number or not?
        System.out.print("Enter the Duck Number : ");
        int num = sc.nextInt();
        int result = 0;
        int temp = num;
        while (temp > 0) {
            int dg = temp % 10;
            temp /= 10;
            if (dg == 0) {
                System.out.println("It is an Duck Number");
                return;
            }
        }
        System.out.println("It isn't a Duck Number");
    }

    public static int fact(int num) {
        int temp = num;
        int factorial = 1;
        while (temp > 0) {
            factorial *= temp;
            temp--;
        }
        return factorial;
    }

    public static void Q58() {
        // a number is a special number or not?
        System.out.print("Enter the Special Number : ");
        int num = sc.nextInt();
        int result = 0;
        int temp = num;
        while (temp > 0) {
            int dg = temp % 10;
            result += fact(dg);
            temp /= 10;
        }
        if (result == num) {
            System.out.println("It is a Special Number");
        } else {
            System.out.println("It isn't a Special Number");
        }
    }

    public static void Q59() {
        System.out.print("Choose Part of Question No. 59 \n1 , 2, 3 ...   : ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:Q59_1();
            break;
            case 2:Q59_2();
            break;
            case 3:Q59_3();
            break;
            case 4:Q59_4();
            break;
            case 5:Q59_5();
            break;
            case 6:Q59_6();
            break;
            default:
            System.out.println("Enter a valid Question No.");
        }
    }
    public static void Q59_1(){
System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int i = 0,sum = 0;
        do{
            sum+=i;
            i++;
        }while(i<=num);
        System.out.println("the Sum of Number from 0 to "+num+" is : "+sum);

    }
    public static void Q59_2(){
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int i = 1,sum = 0;
        do{
            int temp=fact(i);
            sum +=temp;
            i++;
        }while(i<=num);
        System.out.println("1!+2!+3!+4!+.... "+num+" is : "+sum);

    }
    public static void Q59_3(){
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int i=1;
        float sum =0;
        do{
            float divisor =(float) 1/i;
            sum+=divisor;
            i++;
        }while(i<=num);
       
        System.out.println("1+1/2+1/3+1/4+1/5+.... = "+num+" is : "+sum);
    }
    public static void Q59_4(){
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int i=0;
        float sum =1;
        do{
            i+=2;
            float divisor =(float) 1/i;
            sum+=divisor;
        }while(i<=num);
       
        System.out.println("1+1/2+1/4+1/8+1/16+.... = "+num+" is : "+sum);
    }
    public static void Q59_5(){
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int i=0;
        float sum =1;
        do{
            float divisor =i+(float) i/10;
            sum+=divisor;
            i++;
        }while(i<=num);
       
        System.out.println("1+1.1+2.2+3.3+4.4+5.5+.... = "+num+" is : "+sum);
    }
    public static void Q59_6(){
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int i=0;
        int odd_sum = 0;
        int even_sum =0;
        do{
            even_sum+=i;
            i+=2;
        }while(i<=num);
        i=1;
        do{
            odd_sum+=i;
            i+=2;
        }while(i<=num);
       
        System.out.println("1+3+5+7+9+11+.... = "+num+" is : "+odd_sum);
        System.out.println("2+4+6+8+10+12+.... = "+num+" is : "+even_sum);
    }
public static void Q60(){
    //Wap to print Tribonacci series using do while loop
     System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int dg = 1;
        int temp = num;
         System.out.print("Series will be : "+sum1+" "+sum2+" ");
        do{
            dg+=sum1+sum2+sum3;
            sum1=sum2;
            sum2 = sum3;
            sum3 =dg;
            temp--;
            System.out.print(sum3+" ");
            dg =0;
        }
        while(temp>=0);
}

    public static void main(String[] args) {
        Q60();      
    }
}
