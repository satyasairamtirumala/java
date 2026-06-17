import java.util.Scanner;

public class A12 {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element");
        int element=sc.nextInt();
        System.out.println("enter the index");
        int index=sc.nextInt();
        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;


        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
}}
