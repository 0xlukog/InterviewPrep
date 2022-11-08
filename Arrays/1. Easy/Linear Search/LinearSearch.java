public class LinearSearch {
    public static int search(int arr[], int search){
        int key = -1;
        for(int cur = 0;cur<arr.length;cur++){
            if(arr[cur] == search) key = cur;
        }
        return key;
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int searchElement = 3;
        System.out.println(search(array, searchElement));
    }
}
