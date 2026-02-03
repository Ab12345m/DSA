public class Rotatebyd1 {

    public static void PrintRotaten(int[] arr,int d) {
        
        int n = arr.length;

        int temp[]={  1 ,2 ,3 };
        
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        
        int j = 0;
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int d = 2;

        PrintRotaten(arr, d);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        

    }
}
