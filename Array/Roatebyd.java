public class Roatebyd {

    public static int[] PrintRotate1(int[] arr) {
        
        
        int temp[] = { 1, 2 };
        int n = arr.length;
        
        for (int i = 2; i < n; i++) {
            arr[i - 2] = arr[i];
        }
        for (int i = n - 2; i < n; i++) {
            arr[i] = temp[i-(n-2)];
           
        }
        return arr;


    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        PrintRotate1(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
