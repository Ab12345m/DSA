public class FindSorted {

    public static void PrintSort(int arr[], int idx) {

        if (idx == arr.length - 1) {
            return;
        }

        int minindex=idx;
        for (int i = idx+1; i < arr.length; i++) {
            if (arr[i] <= arr[minindex]) {
                minindex = i;
            }
        }
        int temp = arr[minindex];
        arr[minindex] = arr[idx];
        arr[idx] = temp;
        PrintSort(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 0,0, 2,8, 5 };
        PrintSort(arr, 0);

        for(int x:arr){
            System.out.println(x);
        }
        
    }
}
