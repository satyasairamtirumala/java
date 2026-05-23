
import java.util.Scanner;
//check 
public class method15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(count(i,n2)>=1){
                count++;
            }
        }
        System.out.println(count);
    }
    public static int count(int n,int n2){
        int count=0;
        int c=n;
        while(n>0){
            int last=n%10;
            if(last==2){
                count+=1;
            }
            n=n/10;
        }
        return count;
    }
}