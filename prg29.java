import java.util.*;
public class prg29 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int sqr=n*n;
      int res=0,val=0;
      while(sqr>0){
        res=sqr%10;
        val+=res;
        sqr=sqr/10;
      }
      if(n==val){
        System.out.println("Neon");
      }
      else{
        System.out.println("Not neon");
      }
    }
}
