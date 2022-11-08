public class CheckSorted {
    public static boolean Check(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i])
              return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,4,5};
        System.out.println(Check(arr));
    }
}
