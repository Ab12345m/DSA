public class Palindrome {

    public static void PrintPalindrome(int n) {
        int original = 0;
        int reverse = 0;


        while (n > 0) {
            int last = n % 10;
            reverse = reverse * 10 + last;
            n = n / 10;

        }

        if (original == reverse) {
            System.out.println("palindrome number");
        }
        else {
            System.out.println(" not palindrome");
        }
    }

    public static void main(String[] args) {
        int n = 123;
        PrintPalindrome(n);
        
    }
}
