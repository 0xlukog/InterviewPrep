import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray{
    public static int[] RemoveDuplicates(int arr[]){
        Set<Integer> unique = new HashSet<Integer>();
        for(int curr : arr){
            unique.add(curr);
        }
        int retArray[]= new int[unique.size()];
        int i=0;
        for(int curr : unique){
            retArray[i++]= curr;
        }
        return retArray;
    }
    public static void main(String[] args) {
        int array [] = {1,1,2,2,2,3,3};
        for(int element : RemoveDuplicates(array)){
            System.out.print(element+" ");
        }
    }
}