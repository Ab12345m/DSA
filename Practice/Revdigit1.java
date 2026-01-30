public class Revdigit1 {

    public static int PrintRev(int n) {
        //convert integer to string
        StringBuffer s = new StringBuffer(String.valueOf(n));

        s.reverse();

        //convert string into number

        n = Integer.parseInt(String.valueOf(n));

        return n;
    }
    public static void main(String[] args) {
        
    }
}
