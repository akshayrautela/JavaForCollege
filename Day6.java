import java.util.*;
public class Day6{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //frequency of each element of array
        System.out.print("Enter length of array");
        int l = sc.nextInt();
        int []arr = new int[l];
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }

        int count =0;
        int ahed =0;
        for(int i=0;i<arr.length;i++){
             ahed = arr[i];
             if(arr[l-1]){
                
             }else{
                 if(arr[i+1] == ahed){
                     count++;
                 }
             }
        }
System.out.println(count);

    }
}