import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int secmin=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<secmin && arr[i]>min){
                secmin=arr[i];
            }
        }
        System.out.println(secmin);
    }
   
}

