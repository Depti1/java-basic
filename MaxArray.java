public class MaxArray {
    public static void main(Str[] args){
        int[] arr = {1,3,5,7,4};
        System.out.println(max(arr));
    }

    static int max(int arr[]){
        int maxnum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                maxnum = arr[i+1];
            }
            else{
                return arr[i];
            }
            
        
        }
        return maxnum;

    }
    
}
