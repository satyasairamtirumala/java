import java.util.Scanner;

public class method23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=0;
        String s="";
        while(n>0){
            int res=n%2;
           s=res+s;
            n=n/2;
        }
        System.out.println(s);
    }

}
