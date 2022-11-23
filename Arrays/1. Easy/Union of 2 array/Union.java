import java.util.HashSet;
import java.util.Set;

public class Union {
    public static int[] findUnion(int[] arr,int arr2[]){
        Set<Integer>Union = new HashSet<>();
        for(int cur : arr){
            Union.add(cur);
        }
        for(int cur : arr2){
            Union.add(cur);
        }
        return Union.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int B[] = {2,4,9,5};
        for(int x : findUnion(A, B)){
            System.out.print(x+" ");
        }
    }
}
