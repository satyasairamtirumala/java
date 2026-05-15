import java.util.*;
public class prg28 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int sum=0,prod=1;
        int res;
        while(n1>0){
            res=n1%10;
            sum=sum+res;
            prod*=res;
            n1=n1/10;

        }
        // System.out.println(sum);
        // System.out.println(prod);
        if(prod==sum){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not spy number");
        }
    }
}
