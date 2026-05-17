
import java.util.Scanner;

public class method5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(EvenOdd(n)){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static boolean EvenOdd(int n){
        boolean val=true;
        return n%2==0;
        
    }
}
