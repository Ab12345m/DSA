public class Array1 {
    public static void main(String[] args) {
        
        int[] arr = new int[4];

        arr[0]=2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index"+i+":"+arr[i]);
        }

    }
}
