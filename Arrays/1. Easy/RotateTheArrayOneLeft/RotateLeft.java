public class RotateLeft {
    public static int[] RotateArray(int arr[]){
        int rotateCount = 1; // this maipulates how many positions the array will rotate
        int rotated[] = new int[arr.length];
        for(int i=0;i<arr.length;rotateCount++,i++){
            rotated[i] = arr[rotateCount%arr.length];
        }
        return rotated;
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        for(int x : RotateArray(array)){
            System.out.print(x+ " ");
        }
    }
}
