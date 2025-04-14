import java.util.Arrays;

public class SwapArray {
    public static void main(Str[] args){
        int[] arr = {1,2,3,4,5};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
        
    }
    static void swap(int array[] , int index1 , int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    
}
