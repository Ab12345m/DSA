public class Array3 {
    public static void main(String[] args) {
        
        
        int arr[] = { 1, 2, 3, 4 };
        int smallest = arr[0];
        
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
        
    }
}
