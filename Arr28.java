import java.util.Arrays;

public class Arr28 {
    //write a java prg to store distinct elements of array into new array
    public static void main(String[] args) {
        int arr[]={10,20,30,10,30};
        int val=-1;
        int res=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=val;
                }
            }
            if(arr[i]!=-1){
                System.out.println(arr[i]);
                res++;
            }
            
        }
        int arr2[]=new int[res];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                arr2[count]=arr[i];
                count++;
            }
        }
        System.out.println("Distinct");
            System.out.println(Arrays.toString(arr2));
       
    }
}
