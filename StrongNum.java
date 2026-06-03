public class StrongNum {
    public static void main(String[] args) {
        int n=145;
        int val=n;
        int res=0;
        int fal=0;
        while(val>0){
            res=val%10;
            int fact=1;
            while(res>0){
                fact*=res;
                res--;
            }
           fal+=fact;
            val=val/10;
        }
        if(fal==n){
            System.out.println("StrongNum");
        }
        else{
            System.out.println("Not Strong");
        }
    }
}
