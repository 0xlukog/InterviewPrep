public class SecondLargestElement2 {
    // Finding 2nd smallest and 2nd largest element
    public static int[] find2Min(int arr[]){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int max =Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int cur : arr){
            if(smallest>cur){
                smallest = cur;
            }
            if(largest<cur){
                largest = cur;
            }
        }
        for(int cur : arr){
            if(cur<largest && cur > max) max = cur;
            if(cur>smallest && cur < min) min = cur;
        }
        int retArray []= {max,min};
        return retArray;
    }
    public static void main(String[] args) {
        int array [] = {1,2,4,7,7,5};
        int arr[] = new int[2]; 
        arr = find2Min(array);
        System.out.println(arr[0] + " "+arr[1]);
    }
}
