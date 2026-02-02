public class Largest {

    public static int PrintHello(int[] arr) {

        int n = arr.length;

        int Largest = -1, secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
        }

        //find second largest


        for (int i = 0; i < n; i++) {

            if (arr[i] > secondLargest && arr[i] != Largest) {
                secondLargest = arr[i];

            }
        }
        
        return secondLargest;
    }


    public static void main(String[] args) {
        int arr[] = { 20, 10, 40, 15, 90 };
        System.out.println(PrintHello(arr));
        
        
    }
}
