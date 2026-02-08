public class MoveZero {

    public static int[] MoveZeronum(int[] arr) {
        
        int n = arr.length;

        int temp[] = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[count++] = arr[i];
                
            }
        }
        int nz = temp.length;
        for (int i = 0; i < nz; i++) {
            arr[i] = temp[i];
        }
        
        for (int i = nz; i < n; i++) {
            arr[i] = 0; 
        }

        return arr;
    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 4, 0, 5, 0, 9, 3, 6 };
        MoveZeronum(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
