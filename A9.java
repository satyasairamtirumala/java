import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int index=sc.nextInt();
        int val=sc.nextByte();
        for(int i=0;i<arr.length;i++){
            if(i==index){
                arr[i]=val;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
