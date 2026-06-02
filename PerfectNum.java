public class PerfectNum {
    public static void main(String[] args) {
        int n=6;
        int val=0;
        for(int i=1;i<n;i++){ 
            if(n%i==0){
                val+=i;
            }
        }
        if(val==n){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not Strong");
        }
    }
}
