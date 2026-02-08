public class MoveZeroopt {

    public static void MoveZeron(int[] arr) {
        
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }
    }
    
    public static void main(String[] args) {

        int arr[] = { 1, 2, 0, 3, 0, 5, 6, 7 };

        MoveZeron(arr);

        for (int num : arr) {
            System.out.println(num);
        }
        
    }
}
