public class Rotatebydopt2 {

    public static void PrintRotated(int[] arr, int d) {
        
        int n = arr.length;

        int temp[] = new int[n];

        for (int i = 0; i < n-d; i++) {
            temp[i] = arr[d+i];
        }
        
        for (int i = 0; i < d; i++) {
            temp[n - d+i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int d = 2;

        PrintRotated(arr, d);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
