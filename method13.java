//program to check whether the given number is less than 9
import java.util.Scanner;

public class method13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Sum(n);
    }
    public static void Sum(int n){
        int val=0;
        while(n>0){
            int res=n%10;
            val+=res;
            n=n/10;
            if(n==0 && val>9){
                n=val;
                val=0;
            }
        }
        System.out.println(val);
    }

}
