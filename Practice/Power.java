public class Power {

    public static int PrintPow(int n, int pow) {
        int result = 1;
       
        for (int i = 1; i <= pow; i++) {
            result = result * n;
        }
        return result;
        
    }

    public static void main(String[] args) {
        int n =3;
        System.out.println(PrintPow(n, 2));
        
    }
}
