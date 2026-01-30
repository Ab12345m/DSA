public class Revdigit {

    public  void PrintRev(int n, int[] revnum, int[] basePos) {
        
        if (n > 0) {
            PrintRev(n / 10, revnum, basePos);

            revnum[0] += n % 10 * basePos[0];
            basePos[0]*= 10;
        }
    }

    public static void main(String[] args) {
        
        Revdigit revdigit = new Revdigit();
        int n = 2345;
        int[] revnum = { 0 };
        int[] basePos = { 1 };
        revdigit.PrintRev(n, revnum, basePos);
        System.out.println(revnum[0]); 
        
    }
}
