public class thirdlarge {

    public static int Printthird(int[] arr) {
        
        int n = arr.length;

        //find first largest

        int first = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                first = arr[i];
            }
        }

        //find second largest

        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }


        //third largest

        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }
        
        //fourth largest

        int fourth = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > fourth && arr[i] < third) {
                fourth = arr[i];
            }
        }
        return fourth;



    
    }
    
    public static void main(String[] args) {
        int arr[] = { 20, 12, 23, 40 };
        System.out.println(Printthird(arr));
        
    }
}
