public class RotateLeftOptimal {
    public static void reverseArray(int arr[],int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void RotateArray(int arr[], int rotateCount){
        int n = arr.length; 
        rotateCount = rotateCount%n;  // mod by n, if k is greater than n
        reverseArray(arr, 0, rotateCount-1); 
        reverseArray(arr, rotateCount, n-1);
        reverseArray(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        RotateArray(arr,3);
        for(int x :arr){
            System.out.print(x+ " ");
        }
    }
}
