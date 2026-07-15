

public class prime {
    public static void main(String[] args) {
        int n=7;
        boolean val=true;
        for(int i=3;i<n;i++){ 
            if(n%i==0){
                val=false;
                break;
            }

        }
        if(val==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
