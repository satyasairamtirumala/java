
import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(SumDigit(n));
    }
    public static int SumDigit(int n){
        if(n<=9){
            return n;
        }
        return n%10+SumDigit(n/10);
    }
}
