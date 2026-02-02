public class Thirdlargeopt {

    public static int PrintThird(int[] arr) {
        
        int n = arr.length;

        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,
                third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
                
            } else if (arr[i] > second) {
                second = first;

            } else if (arr[i] > third) {
                third = arr[i];

            }
        }
        return third;
    }
    
    public static void main(String[] args) {
        
    }
}
