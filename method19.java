
import java.util.Scanner;

public class method19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++){
            harshad(i);
        }
    }//check
    public static void harshad(int n){
        int r=n;
        int val=0;
        while(n>0){
            int res=n%10;
            val+=res;
            n=n/10;
        }
        if(r%val==2){
            System.out.println(r);
        }
    }
}
