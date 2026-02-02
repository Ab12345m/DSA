

public class Removedup {

    public static int Printdup(int[] arr) {
        
        int n = arr.length;

        if (n <= 1) {
            return n;
        }

        int idx = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
        return idx;


    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 4, 5, 6 };

        int dup1 = Printdup(arr);

        for (int i = 0; i < dup1; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
