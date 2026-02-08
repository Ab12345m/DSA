import java.util.ArrayList;
public class Repeat {

    static ArrayList<Integer> PrintIntersect(int[] a, int[] b) {

        ArrayList<Integer> res = new ArrayList<>();

        int m = a.length;
        int n = b.length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (a[i] == b[j]) {
                    if (!res.contains(a[i])) {
                        res.add(a[i]);
                    }
                }
            }
        }
        return res;
        
    }
    
    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 3, 4, 5 };
        int b[] = { 1, 2, 4, 4, 7 };

        ArrayList<Integer>res=PrintIntersect(a,b);

        for (int val : res) {
            System.out.println(val);
        }
        
    }
}
