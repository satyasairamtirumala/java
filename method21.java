import java.util.Scanner;

public class method21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n=sc.nextInt();
        ext(n);
    }
    public static void ext(long n){
        long count=0;
        long fin=0;
        long fin2=0;
        while(n>0){
            long res=n%10;
            n=n/10;
            if(count<=0 || n==0){
                fin+=res;
                count++;
            }
            else{
                fin2+=res;
            }
        }
       if(fin==fin2){
        System.out.println("xylem number");
       }
       else{
        System.out.println("pholem number");
       }
    }
}
