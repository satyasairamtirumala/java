import java.util.Scanner;

public class method8 {
    public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println( Fact(n));
    }
    public static int Fact(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
}
