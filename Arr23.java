
import java.util.Arrays;
import java.util.Scanner;

public class Arr23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=0;
        int arr[]={10,20,30,40,50};
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            last=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=last;
        }
        System.out.println("after rotation"+Arrays.toString(arr));
        
        
    }
}
