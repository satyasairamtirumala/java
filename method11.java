
import java.util.Scanner;

public class method11 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       Palin(n);
    }
    public static void Palin(int n){
        int res=n;
        int val=0;
        while (n>0) {
            int last=n%10;
            val=val*10+last;
            n=n/10;
        }
        if(val==res){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
