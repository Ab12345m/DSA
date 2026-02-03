public class Rotatebydopt1 {
    public static void PrintRotateOpt(int[] arr, int d) {
        
        int n = arr.length;

        for (int i = 0; i < d; i++) {
            
            int temp = arr[0];

            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }
    
    public static void main(String[] args) {
        
    }
}
