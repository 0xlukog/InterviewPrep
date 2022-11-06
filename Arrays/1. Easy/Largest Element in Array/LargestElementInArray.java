import org.omg.CORBA.FieldNameHelper;

public class LargestElementInArray{
    public static int FindLargest(int arr[]){
        //Assuming the array contains only positive integer
        int max = 0;
        for(int curr : arr){
            if(cur>max) max = curr;
        }
        return max;
    }
    public static void main(String[] args) {
        int array[] = {2,5,1,3,0};
        System.out.println(FindLargest(array));
    }
}