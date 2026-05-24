
import java.util.Scanner;
//range of neon number
public class method18 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++){
            Neon(i);
        }
    }
    public static void Neon(int n){
        int sqr=n*n;
        int s=sqr;
        int val=0;
        while(sqr>0){
            int res=sqr%10;
            val+=res;
            sqr/=10;
        }
        if(n==val){
            System.out.println(n);
        }

    }

}
