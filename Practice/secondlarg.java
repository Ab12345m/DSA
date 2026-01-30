public class secondlarg {

    public static int Printsecond(int[] arr) {
        
        int largest = -1, secondlargest = -1;
        int n=arr.length;

        //find largest

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else {

                if (arr[i] < largest && arr[i] > secondlargest) {
                    secondlargest = arr[i];
                }
            }
        }
        return secondlargest;
        
    }



    public static void main(String[] args) {
        int arr[] = { 12, 20, 30, 40 };
        System.out.println(Printsecond(arr));

        
    }
}
