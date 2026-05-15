import java.util.*;
public class prg30 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        while(n>0){
            int val=n%10;
            res+=val;
            n=n/10;
        }
        if(n%res==0){
            System.out.println("Harsadh number");
        }
        else{
            System.out.println("Not Haesadh number");
        }
    }
}
