import java.util.*;

public class Day10 {
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
  sc.nextLine();
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

public static void transpose(int[][] arr){
    int[][] b = new int[arr.length][arr[0].length];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            b[i][j] = arr[j][i];
        }
    }
    display(b);
}
public static void addArray(){
    int[][] arr = create();
    int[][] b = create();
    int[][] sum = new int[arr.length][arr[0].length];
  
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            sum[i][j] =  arr[i][j]+ b[i][j];
        }
    }
    display(sum);

}
public static void mul(){
    //int [][] arr ={{1,2,3},{1,2,3},{1,2,3}};
    //int [][] b ={{1,2,3},{1,2,3},{1,2,3}};
    int[][] arr = create();
   int[][] b = create();
    
      int[][] mul = new int[arr.length][arr[0].length];
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++)
        {
            for(int k=0;k<arr[0].length;k++){
            mul[i][j] = mul[i][j]+arr[j][k]*b[k][j];
        }
    }
       }
    display(mul);
      
          //display(mul);
}
public static void emptymatrics(){
    int[][] arr = create();
    int index = 9;
while(index>=0){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.println("Enter the No.");
        int in = sc.nextInt();
            arr[i][j] = in;
            index--;
            display(arr);
             }
        }
    }
}
public static void diagonalprint(){
    int[][] arr = create();
    int rw = 0; int cl =2;
    for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[0].length;j++){
            if(i==j){
                System.out.print(arr[i][j]+" ");
            }
         }
    }
    System.out.println();
             while(rw<=2 && cl>=0 ){
                System.out.print(arr[rw++][cl--]+" ");
                
            }

}
public static void nondiagonalSum(){
    int[][] arr = create();
    int sum =0; int rw = 0; int cl =2;
      for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[0].length;j++){
            if(i != j && i+j !=2){
sum+=arr[i][j];
            }
         }
      }
    //   while(cl<=0 && rw>=2){
    //       sum-=arr[rw--][cl--];
    //   }
System.out.println("The sum of non diagonal elements are "+ sum);
}
public static void anti_diagonal(){
    int[][] arr = create();
    int sum =0;
 for(int i=0;i<arr.length;i++){

         for(int j=0;j<arr[0].length;j++){

            if(i!=j && (i+j)!=2 || i ==1 && j ==1){
               sum+=arr[i][j];
            }
         }
      }
      System.out.println("The sum of non diagonal elements are "+ sum);
}
public static void sum(){
    int[][] arr = create();
    int rs =0; int rc =0;
     for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[0].length;j++){
            rs+=arr[i][j];
            rc += arr[j][i];
         }
         System.out.println("Sum of Row is + "+ rs+" And column sum is "+ rc);

     }

}
public static void search(){
    int key = 8;
    int[][] arr = create();
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i][j] == key){
                System.out.println("The element is at index "+i+","+j);
            }
        }
    }
}
public static void sorting(){
    int [][] arr = create();
    int [] a = new int[arr.length*3];
    int index = 0;
   for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
           a[index++] = arr[i][j];
        }
   }
  for(int i=0;i<a.length-1;i++){
        for(int j=i+1;j<a.length;j++){
        if(a[i]>a[j]){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        }
   }
   index =0;
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            arr[i][j] = a[index++];
        }
   }
   display(arr);
 
}
public static void rotate(){
    int[][] arr = create();
    transpose(arr);
   for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length;j++){
            if(j == 0){
                int temp = arr[i][j];
                arr[i][j] = arr[i][j+2];
                arr[i][j+2] = temp;

                
            }
        }
   }
   display(arr);

}

    public static void main(String[] args) {
        //1 2 3 4 5 6 7 8 9
        //9 8 6 1 3 2 5 4 7
        //transpose(create());
        //addArray();
        //mul();
        //emptymatrics();
        //diagonalprint();
        //nondiagonalSum();
        //anti_diagonal();
        //sum();
        //search();
        //sorting();
        rotate();
        
    }
}