public class Pathmesh {

    public static int PrintMash(int i, int j, int m, int n) {

        if (i == n || j == m) {
            return 0;
        }

        if (i == n - 1 && j == n - 1) {
            return 1;
        }
        
        int downPath = PrintMash(i + 1, j, m, n);

        int rightPath = PrintMash(i, j + 1, m, n);

        return downPath + rightPath;
    }
    
    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPath = PrintMash(0, 0, m, n);
        System.out.println(totalPath);
    }
}
