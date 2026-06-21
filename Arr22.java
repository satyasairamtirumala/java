import java.util.*;
public class Arr22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n value");
        int ind=sc.nextInt();
        int lowest=0;
        int []arr={2,0,4,9,13,6,10,4};
        while (ind!=0) { 
            int idx=0;
            int min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                    idx=i;
                }
                lowest=min;

            }

            arr[idx]=Integer.MAX_VALUE;
            ind--;
        }
        System.out.println(lowest);
    }
}


