import java.util.Arrays;

public class Practice {

    public static int PrintLarge(int[] arr) {

        int n = arr.length;

        Arrays.sort(arr);

        for (int i = n - 2; i > 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = { 12, 8, 54, 23, 34, 45 };
        System.out.println(PrintLarge(arr));
    }
    
}
