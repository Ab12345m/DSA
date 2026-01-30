public class Largest {

    public static int PrintHello(int[] arr) {

        int largest = -1, secondlarg = 1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondlarg = largest;
                largest = arr[i];

            } else {
                if (arr[i] < largest && arr[i] != secondlarg) {
                    secondlarg = arr[i];
                }

            }
        }
        return secondlarg;
        


        
    }

    public static void main(String[] args) {
        int arr[] = { 20, 10, 40, 15, 90 };
        System.out.println(PrintHello(arr));
        
        
    }
}
