import java.util.HashSet;

public class Removedup {

    public static int Printdup(int[] arr) {
        
        HashSet<Integer> s = new HashSet<>();
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!s.contains(arr[i])) {
                s.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        return idx;


    }
    
    public static void main(String[] args) {
        
    }
}
