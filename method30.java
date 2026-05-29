
import java.util.Scanner;

class method30{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      gcd(n1,n2);
    }
    public static  void gcd(int n1,int n2){
        if(n1>n2){
            int res1=0;
            while(n1>0 || n2>0){
                res1=n2%n1;
            n1=n2;
            n2=res1;
            }
            System.out.println(n2);
        }

        else{
            int res2=0;
            while(n1>0 && n2>0){
                 res2=n1%n1;
            n2=n1;
            n2=res2;
            }
            System.out.println(n1);
        }

    }
}