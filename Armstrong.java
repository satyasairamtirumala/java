
public class Armstrong {
    public static void main(String[] args) {
        int n=135;
        int val=n;
        int val1=0;
        int res=0;
        while(val>0){
            val1=val%10;
            res+=val1*val1*val1;
            val=val/10;
        }
        if(res==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }

    }
}
