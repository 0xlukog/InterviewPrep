public class MoveZerosToEndOptimal {
    private static int[] ZerosToEnd(int arr[]) {
        int firstZero = 0;
        int firstNonZero = 0;
        int arrLength = arr.length;
        while(arr[firstZero]!=0){ // finding the first occurance of zero in the array
            firstZero++;
        }
        firstNonZero = firstZero+1;
        while(firstZero < arrLength && firstNonZero<arrLength){
           if(arr[firstNonZero]!=0){
            int temp = arr[firstZero];  // swapping the zero element with non zero element
            arr[firstZero]= arr[firstNonZero];
            arr[firstNonZero] = temp;
            firstZero++;
           }
           firstNonZero++;
    }
        return arr;
    }
    public static void main(String[] args) {
        int array [] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        for(int x : ZerosToEnd(array)){
            System.out.print(x+" ");
        }
    }
}
