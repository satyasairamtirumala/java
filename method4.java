
import java.util.Scanner;

public class method4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(prime(n)==true){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
    public static boolean prime(int n){
        boolean val=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        
        }
        return true;
    }
}
