import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the search element");
        int search=sc.nextInt();
        boolean val=false;
        for(int i=0;i<arr.length;i++){
            if(search==arr[i]){
                val=true;
                System.out.println("element is present in the index"+i);
                System.exit(0);
            }
        }
        System.out.println("element is not present");
        
    }
}
