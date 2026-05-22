
import java.util.Scanner;

public class method12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long m=sc.nextInt();
        long temp=0,a=0,b=1;
        while(m>0){
            temp=a;
            a=a+b;
            b=temp;
            System.out.println(temp);
            m--;
        }
    }
}
