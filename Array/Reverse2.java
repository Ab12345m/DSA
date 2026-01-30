public class Reverse2 {

    public static void PrintReverse2(int[] arr) {
        int n = arr.length;


        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };

        PrintReverse2(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
