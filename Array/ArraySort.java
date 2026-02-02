public class ArraySort {

    public static boolean PrintSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            } 
            }
        return true;
    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 4, 5 };
        System.out.println(PrintSort(arr));

    }
}
