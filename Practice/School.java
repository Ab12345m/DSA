public class School {

    public static boolean PrintPrime(int n) {
        if (n <= 0) {
            return false;
        }

         
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(PrintPrime(n));
        
    }
}
