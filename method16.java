
import java.util.Scanner;
//check
public class method16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(Fact(n)==n){
            System.out.println("Strong");
        }
        else{
            System.out.println("not strong");
        }
    }
    public static int Fact(int n) {
        int c=n;
        int val=0;
        
        while(n>0){
            int res=n%10;
            int fact=1;
            while(res>0){
                fact*=res;
                res--;
            }
            val+=fact;
            n=n/10;
        }
        return val;
    }
}
