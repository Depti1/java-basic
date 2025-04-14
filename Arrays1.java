import java.util.Scanner;

public class Arrays1 {
    public static void main(Str[] args){
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
       // for(int i =0; i<arr.length ; i++){
            arr[i] = input.nextInt();
           // System.out.println(arr[i]);
        
      //  for(int i =0 ;i<arr.length;i++){
        //    System.out.print(arr[i] + " ");
        //}
        for(int i : arr){
            System.out.println(i);
        }
    }
    
}
