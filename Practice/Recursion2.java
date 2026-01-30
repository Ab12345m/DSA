public class Recursion2 {

    public static void PrintNum1(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        PrintNum1(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        PrintNum1(n);
    }
}
