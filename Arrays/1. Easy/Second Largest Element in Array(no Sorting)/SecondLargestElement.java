public class SecondLargestElement{
    public static int FindSecondLargest(int arr[]){
        int max = 0;
        int SeconeLarge = -1;
        for(int curr : arr){
            if(max < curr) max = curr;
        }
        for(int curr : arr){
            if(curr > SeconeLarge && curr< max) SeconeLarge = curr;
        }
        return SeconeLarge;
    }
    public static void main(String[] args) {
        int array [] = {1,2,4,7,7,5};
        System.out.println(FindSecondLargest(array));
    }
}