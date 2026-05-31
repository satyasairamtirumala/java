public class Fibonacci {
    public static void main(String[] args) {
        int n=5;
        int a=0;
        int b=1;
        int temp;
        while(n>=0){
             temp=a;
             a=b+a;
             b=temp;
             System.out.println(a);
             n--;
    }
}
}
