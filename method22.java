
import java.util.Scanner;

public class method22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);
    }
    public static void prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("not twisted");
                return;
            }
        }
        int val=0;
        while(n>0){
            int res=n%10;
            val=val*10+res;
            n=n/10;
        }
        for(int i=2;i<val;i++){
            if(val%i==0){
                System.out.println(" not twisted prime");
                return;
            }
        }
        System.out.println("twisted prime");
    }
}
