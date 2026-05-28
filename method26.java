
import java.util.Scanner;

public class method26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        count(n);
        int res=0;
        while(n>0){
            int last=n%10;
            res=res+power(last,count(n));
            n=n/10;
        }
        System.err.println(res);
    }
    public static int count(int n){
        int count=0;
        while(n>0){
            int last=n%10;
            count+=1;
            n=n/10;
        }
        return count;
    }
    public static int power(int n1,int n2){
        int res=1;
        while(n2>0){
            res*=n1;
            n2--;
        }
        return res;
    }
}
