import java.util.Scanner;

public class method24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sqrSource = sqr(n);          // Step 1: Square original number (e.g., 12 -> 144)
        int revSource = reverse(n);      // Step 2: Reverse original number (e.g., 12 -> 21)
        int sqrRev = sqr(revSource);     // Step 3: Square reversed number (e.g., 21 -> 441)
        int revSqrRev = reverse(sqrRev); // Step 4: Reverse that square   (e.g., 441 -> 144)
        
        if (sqrSource == revSqrRev) {
            System.out.println("ADAM NUMBER");
        } else {
            System.out.println("not adam number");
        }
        sc.close();
    }

    // Squares a given number
    public static int sqr(int n) {
        return n * n;
    }

    // Reverses the digits of a given number
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        return rev;
    }
}
