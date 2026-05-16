import java.util.*;
public class method3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sum(n1,n2);
    }
    public static void sum(int v1,int v2){
        int sum=0;
        for(int i=v1;i<=v2;i++){
           sum+=i;
        }
        System.out.println(sum);
    }
}
