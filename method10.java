import java.util.Scanner;

public class method10 {
    public static void main(String[] args) {
                    Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(Prime(n)==0){
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
    public static int Prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return 1;
            }
        }
        return 0;
            
       
    
    
}
}
