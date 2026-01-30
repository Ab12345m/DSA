public class TowerOfHanoi {
    public static void PrintTowerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk" + n + "from" + src + "to" + dest);
            return;
        }
        PrintTowerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk" + n + "from" + src + "to" + dest);
        PrintTowerOfHanoi(n-1, helper,src, dest);

    }

    public static void main(String[] args) {
        int n = 2;
        PrintTowerOfHanoi(n, "S", "H", "D");
        
    }
}
