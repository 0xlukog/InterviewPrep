import java.util.ArrayList;
import java.util.HashMap;

public class Intersection {
    public static int[] findIntersection(int[] A,int[] B){
        HashMap<Integer,Boolean>Aelements = new HashMap<>();
        ArrayList<Integer> ret = new ArrayList<>();
        for(int x : A){
            if(!Aelements.containsKey(x))Aelements.put(x, false);
        }
        for(int x : B)if(Aelements.containsKey(x))ret.add(x);

        return ret.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int B[] = {2,4,5};
        for(int x : findIntersection(A, B)){
            System.out.print(x+" ");
        }
    }
}
