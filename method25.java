
import java.util.Scanner;

public class method25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sqr(n);
        rev(n);
        sqr(rev(n));
        rev(sqr(n));
        if(sqr(rev(n))== rev(sqr(n))){
            System.out.println("adam number");
        }
        else{
            System.out.println("Not adam number");
        }

    }
    public static int sqr(int n){
        return n*n;
    }
    public static int rev(int n){
        int val=0;
        while(n>0){
            int last=n%10;
            val=val*10+last;
            n=n/10;
        }
        return val;
    }
}
