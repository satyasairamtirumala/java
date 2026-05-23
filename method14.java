
import java.util.Scanner;

public class method14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
         for(int i=n1;i<=n2;i++){
            Prime(i);
         }
    }
    public static void Prime(int n){
        int val=1;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                val=0;
                break;
            }
        }
        if(val==1){
            System.out.println(n);
        }
        
    }
}
