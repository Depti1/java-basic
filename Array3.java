import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        

       
        
        Scanner input  = new Scanner(System.in);
        System.out.println("enter array size");
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i<nums.length ; i++){
            nums[i] = input.nextInt();
            System.out.println("element is" + nums[i]);

        }
    }
}
