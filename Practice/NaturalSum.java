public class NaturalSum {

    public static void naturalNumber(int i, int n, int sum) {
        if (n == i) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        naturalNumber(i+1, n, sum);
    }

    public static void main(String[] args) {
        int n = 5;
        naturalNumber(1, n, 0);
        
    }
}
