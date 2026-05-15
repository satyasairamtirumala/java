import java.util.*;
public class prg31 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        while(n>0){
            int val=n%10;
            res=res*10+val;
            n=n/10;
        }
        System.out.println(res);
        if(res==n){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}
