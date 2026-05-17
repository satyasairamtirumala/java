import java.util.*;
public class method6{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n=sc.nextInt();
        System.out.println(count(n));

    }
    public static long count(long n){
        int count=0;
        
        while(n>0){
            long last=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
}