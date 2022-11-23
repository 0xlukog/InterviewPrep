public class FindMissingNumber {
    public static int findMissing(int arr[]){
        int sum =0;
        int len =arr.length+1;
        for(int cur: arr){
            sum+=cur;
        }
        return (len*(len+1))/2-sum;
    }
    public static void main(String[] args) {
        int[]array = {1,2, 4, 3,6};
        System.out.println(findMissing(array));
    }
}
