public class Thirdlarge {
    public static int Printthird(int[] arr) {

        int n = arr.length;

        int first = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                first = arr[i];
            }
        }

        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }

        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }
        return third;

    }
    
    public static void main(String[] args) {
        int arr[] = { 12, 24, 36, 48, 10 };
        System.out.println(Printthird(arr));
    }
}
