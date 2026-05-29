
import java.util.Scanner;

public class method29 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int a=0,b=1,c=1;
       int temp=0;
       int n=sc.nextInt();
       while(n>0){
         int res=a+b+c;
        System.out.println(res+" ");
        a=b;
        b=c;
        c=res;
        n--;
       }
       
    }
}
