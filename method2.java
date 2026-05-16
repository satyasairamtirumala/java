import java.util.*;
public class method2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);
    }
    public static void fact(int f){
        int val=1;
        for(int i=1;i<=f;i++){
            val*=i;
        }
        System.out.println(val);
    }
}
