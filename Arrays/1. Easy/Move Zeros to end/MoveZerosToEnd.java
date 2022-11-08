public class MoveZerosToEnd{
    public static int[] ZerosToLeft(int arr[]) {
        int returnArray[] = new int[arr.length];
        int returnArrayPosition = 0;
        int zeroCount = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){ 
                returnArray[returnArrayPosition] = arr[i];
                returnArrayPosition++;
            }
            else{zeroCount++;}
        }
        for(int i = returnArrayPosition+1;i<arr.length;i++){
            returnArray[i]=0;
        }
        return returnArray;
    }
    public static void main(String[] args) {
        int array [] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        for(int x : ZerosToLeft(array)){
            System.out.print(x+" ");
        }
    }
}