import java.util.Scanner;

public class Array2 {
    public static void main(Str[] args){
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i<arr.length; i++){
          arr[i] = input.nextInt();    //user input liya 
         // System.out.println(arr[i]);
        }
        for(int num:arr){                    //for each loop  num represent the array element in arr[i]
            System.out.print(num + " ");
        }

        }
    
    
}
