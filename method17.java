
import java.util.Scanner;
//happy number
public class method17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqr=n*n;
        if((Sqrt(sqr))==0){
            System.out.println("Happy number");
        }
        else{
            System.out.println("not happy number");
        }
       
    }
    public static int  Sqrt(int n){
        int c=n;
        int sum=0;
        while(n>0){
            int last=n%10;
            sum+=last*last;
            n=n/10;
            if(n==0 && sum!=1){
                n=sum;
                sum=0;
            }
            if(sum==1){
                return 0;
            }
            if(sum==4){
                break;
            }
        }
        return 1;
    }
}
