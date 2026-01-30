import java.util.Arrays;

public class Largest2 {

    public static int Printsecond(int[] arr) {
        
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 5, 9 };

        System.out.println(Printsecond(arr));

        
    }
}
