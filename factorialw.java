public class factorialw {
    public static void main(String[] args) {
        int n=5;
        int val=1;
        while(n>0){
            val*=n;
            n--;
        }
        System.out.println(val);
    }
}
