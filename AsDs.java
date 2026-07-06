import java.util.Arrays;

public class AsDs {
    public static void main(String[] args) {
        int arr1[]={8,3,7,5,2,5};
        int fi=0;
        int li=arr1.length-1;
        int mid=(fi+li)/2;
        for(int i=0;i<arr1[mid];i++){
            for(int j=0;j<arr1[mid];j++){
                if(arr1[j]>arr1[j+1]){
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        for(int i=arr1.length/2+1;i>=0;i--){
            for(int j=arr1.length/2+1;j>=0;j--){
                if(arr1[j]<arr1[j+1]){
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}

//write a java prg to sort first of in ascending order and second order in decending order